import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args) {

        String word = "abc";
        String[] myArray = word.split("");
        permutation(myArray, myArray.length);

    }

    private static void swap(String[] array, int right, int left) {
        String temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    public static void permutation(String[] myArray, int currentPosition) {
        if (currentPosition == 1) {
            System.out.println(Arrays.toString(myArray));
        } else {
            for (int i = 0; i < currentPosition; i++) {
                // subtract one from the last position
                // selecting the the next last item
                permutation(myArray, currentPosition - 1);

                // if it's odd position
                if (currentPosition % 2 == 1) {
                    swap(myArray, 0, currentPosition - 1);
                } else {
                    swap(myArray, i, currentPosition - 1);
                }
            }
        }
    }
}
