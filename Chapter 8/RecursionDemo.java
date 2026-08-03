// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 08 — Recursion: Digital Password & File System Simulator
public class RecursionDemo {
    public static int sumDigits(int n){
        int sum = 0;
        n=Math.abs(n);
        while (true) { 
            if(n<10){
                sum+=n;
                return sum;
            }
            sum+=n%10;
            n/=10;
        }
    }
    public static void main(String[] args) {
        System.out.println("SumDigits(9875) = "+RecursionUtils.sumDigits(9875));
        System.out.println("SumDigits(0) = "+RecursionUtils.sumDigits(0));
        System.out.println("isPalindrome(\"racecar\") = "+RecursionUtils.isPalindrome("racecar"));
        System.out.println("isPalindrome(\"Madam\") = "+RecursionUtils.isPalindrome("Madam"));
        System.out.println("isPalindrome(\"hello\") = "+RecursionUtils.isPalindrome("hello"));
        System.out.println("countOccurrences(\"banana\", \'a\') = "+RecursionUtils.countOccurrences("banana", 'a'));
        System.out.println("countOccurrences(\"mississippi\", \'s\') = "+RecursionUtils.countOccurrences("mississippi", 's'));
        System.out.println("reverseString(\"OpenAI\") = "+RecursionUtils.reverseString("OpenAI"));
        System.out.println("reverseString(\"You'll Never Walk Alone\") = "+RecursionUtils.reverseString("You'll Never Walk Alone"));
        System.out.println("power(2,10) = "+RecursionUtils.power(2, 10));
        System.out.println("power(3,4) = "+RecursionUtils.power(3, 4));
        /*down here is the comparision, the iterative method can be found at the top of the program. 
        there is no difference between the two outputs, as can be seen by running the program, 
        staying true to the concept that recursive and iterative are always interchangable for a problem (but sometimes one is better than the other)*/
        System.out.println("--- Iterative vs Recursive sumDigits(9875) ---");
        System.out.printf("Iterative: %d  |  Recursive: %d   %n", sumDigits(9875), RecursionUtils.sumDigits(9875));
    }
}
