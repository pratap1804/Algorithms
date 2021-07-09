public class PrimeNumbers {

    public static boolean primeNumber(int number){
        for( int index =2; index<number/2; index++){
            if(number % index == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
       int number =2;
       int count =0;
       while(count < 1000){
           if(primeNumber(number)){
               System.out.println(number);
           }
           count++;
           number++;
       }
    }
}
