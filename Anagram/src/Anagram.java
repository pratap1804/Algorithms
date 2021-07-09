import java.util.Arrays;

public class Anagram<T extends Comparable<T>> {

    public static <T extends Comparable> void anagramString(String s1, String s2)
    {
        if(s1.length() == s2.length())
        {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            char[] charS1 = s1.toCharArray();
            char[] charS2 = s2.toCharArray();

            Arrays.sort(charS1);
            Arrays.sort(charS2);

            boolean result = Arrays.equals(charS1,charS2);
            if(result)
            {
                System.out.println(s1+" and "+ s2+" are "+ " anagram to each other");
            } else
                System.out.println(s1+" and "+ s2+" are not "+ " anagram to each other");
        } else System.out.println(s1+" and "+ s2+" are not"+ " anagram to each other");
    }

    public static void main(String[] args){

        String string1 = "Maximum";
        String string2 = "Minimum";

        anagramString(string1, string2);
    }
}
