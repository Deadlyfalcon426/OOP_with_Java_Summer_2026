// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 08 — Recursion: Digital Password & File System Simulator
public class RecursionUtils {
    public static int sumDigits(int n){
        n=Math.abs(n);
        //below is the base case, triggeres when ones place is entered
        if(n<10){
            return n;
        }
        //recursive case, triggers when ones place is not entered, adds the current ones place to sum and knocks down rest of number by one place value
        return n%10 + sumDigits(n/10);
    }

    public static boolean isPalindrome(String s){
        //base case ending, for both when there are no letters left and if one letter is because any letter n equals itself
        if(s.length()==0 || s.length()==1){
            return true;
        }
        if(s.substring(0,1).equalsIgnoreCase(s.substring(s.length()-1))){
            //recursive case, triggers when we havent finished off the string, and chops off front and last letter from string
            return isPalindrome(s.substring(1, s.length()-1));
        } else{
            return false;
        }
    }

    public static int countOccurrences(String text, char target){
        //base case, triggers at end of string
        if(text.length()==0){
            return 0;
        }
        //recursive case: either it is equal or not, equal adds one to running total and not equal adds zero, then both call again using string with front letter sliced off
        if(text.charAt(0)==target){
            return 1 + countOccurrences(text.substring(1), target);
        } else{
            return 0 + countOccurrences(text.substring(1), target);
        }
    }

    public static String reverseString(String s){
        //base case for when the string ends
        if(s.length()==0){
            return "";
        }
        //recursive i went a bit unconvential, i just started printing out the last letter on the front and calling it back with the letter i moved to the front removed, which esssentially removes the duplicate
        return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
    }

    public static int power(int base, int exp){
        //base case is when exponent hits zero, we just return 1 because 1*n = n, and thats also pretty accurate to math with x^0 =1
        if(exp==0){
            return 1;
        }
        //recurzive case returns base * calling back power with same base and exp-1, just repeated multiplication in a recursive form
        return base * power(base, exp-1);
    }
}
