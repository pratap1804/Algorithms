import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number?");
        int n = scanner.nextInt();

        int array[] = new int[n];
        for (int index =0; index<n; index++)
        {
            System.out.println("Enter number: ");
            array[index] = scanner.nextByte();
        }

        int limit = n-1;
        int temp; // temporary variable to store array element while swapping
        boolean flag =false; // initially taking as swapping not done

        for(int i =0; i<limit; i++)
        {
            for(int j=0; j<limit-i; j++)
            {
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                    flag =true; // swapping done, come out of the loop
                }
            }
            if(flag == false) break; // do no swapping, already sorted
            else flag = false; // assign initial values
        }
        System.out.println("Sorted numbers are: ");

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }
    }
}
