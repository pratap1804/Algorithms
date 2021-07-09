class PrimeAndAnagram {

     static boolean primePalindrome(int number) {

        int temp;
        int remainder;
        int count =0;
        int sum =0;
        temp = number;

        for( int i=1; i<temp; i++){
            if(temp % i == 0){
                count++;
            }
        }
        while(number > 0)
        {
            remainder = number % 10;
            sum = sum *10 + remainder;
            number = number /10;
        }

        if(sum == number && count == 2) {
            return true;
        } else
            return false;
        }
        public static void main (String[]args){

        System.out.println("Numbers that are both prime and palindrome are: ");
        for(int i=1; i<1000; i++)
        {
            if(primePalindrome(i))
            {
            System.out.println(i);
            }
        }
    }
}