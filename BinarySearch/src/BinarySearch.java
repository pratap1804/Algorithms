public class BinarySearch {

    public static int binarySearch(String[] array, String string){

        int leftSide =0;
        int rightSide = array.length - 1;

        while(leftSide <= rightSide){
            int middle = leftSide + (rightSide -1)/2;

            int foundAtMiddle = string.compareTo(array[middle]);

            if(foundAtMiddle ==0){
                return middle;
            }

            if(foundAtMiddle > 0){
                leftSide = middle +1;
            }
            else{
                rightSide = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String [] array = {"Country", "Continent", "Ocean", " Mountains", "Rivers"};
        String strings = "Mountains";

        int result = binarySearch(array,strings);

        if(result == -1){
            System.out.println("Element is not found!");
        } else{
            System.out.println("Element present at index: "+result);
        }
    }
}
