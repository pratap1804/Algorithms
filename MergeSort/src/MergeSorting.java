import java.util.Arrays;

public class MergeSorting {


    public static void main(String[] args) {
        String[] array = {"enormous", "big", "huge", "indefinite", "humongous", "large"};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Result " + Arrays.toString(array));
    }

    public static void mergeSort(String[] array, int leftSide, int rightSide) {
        if (leftSide == rightSide) {
            return;
        } else {
            int middle = (leftSide + rightSide) / 2;
            // sorting the first and the second half
            mergeSort(array, leftSide, middle);
            mergeSort(array, middle + 1, rightSide);
            merge(array, leftSide, middle, rightSide);
        }
    }

    public static void merge(String[] a, int leftSide, int middle, int rightSide)
    {
        // size of the range to be merged
        int mergeSize = rightSide - leftSide + 1;
        // merge both halves into a temporary array temp
        String[] temp = new String[mergeSize];
        // next element to consider in the first range
        int i = leftSide;
        // next element to consider in the second range
        int j = middle + 1;
        // next open position in temp
        int key = 0;

        // as long as i nor j are ful-filling the condition, move the smaller into temp
        while (i <= middle && j <= rightSide) {
            if (a[i].compareTo(a[j]) < 0) {
                temp [key] = a[i];
                i++;
            } else {
                temp [key] = a[j];
                j++;
            }
            key++;
        }
        // note that only one of the two while loops below is executed

        // copy any remaining entries of the first half
        while (i <= middle) {
            temp [key] = a[i];
            i++;
            key++;
        }
        // copy any remaining entries of the second half
        while (j <= rightSide) {
            temp [key] = a[j];
            j++;
            key++;
        }
        // copy back from the temporary array
        for (key = 0; key < mergeSize; key++) {
            a[leftSide + key] = temp [key];
        }
    }
}
