import java.util.List;
import java.util.Scanner;

public class Insertion<T extends Comparable<T>> {

    public static <T extends Comparable> void insertionSorting(T[] array) {
        int length = array.length;
        for (int index = 1; index < length; index++) {
            T temp = array[index];
            int i = index - 1;

            while (i > -1 && (array[i]).compareTo(temp) > 0) {
                array[i + 1] = array[i];
                i--;
            }
        }
        System.out.println(array);
    }

    public static void main(String[] args)
    {
        String array[] = {"Lily", "Sunflower", "Rose"};

        for (int i = 0; i < array.length; i++)
        {
             System.out.println(array[i]);
        }
        insertionSorting(array);
    }
}