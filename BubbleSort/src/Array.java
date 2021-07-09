public class Array {
    public static void main(String[]args){
     int[] arr = {54, 67, 23, 48, 11};

     for(int i = 0; i< arr.length; i++)
         System.out.println(arr[i]);

     int temp;
     for(int i =0; i<arr.length; i++){
         for(int j=0; j< arr.length-i-1; j++){
             if(arr[j]> arr[j+1]){
                 temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     for(int i =0; i< arr.length; i++)
     System.out.println("Sorted Array is: "+arr[i]);
    }
}
