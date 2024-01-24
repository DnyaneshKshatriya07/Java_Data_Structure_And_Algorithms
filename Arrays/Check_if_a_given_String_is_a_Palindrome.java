package Arrays;

/*
Check the String is palindrome or not(Using Three Ways).
1ST way is using Array.
2ND way is using for loop.
3RD way is using StringBuilder.
*/
import java.util.Scanner;

public class Check_if_a_given_String_is_a_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String:- ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] charArray = s1.toCharArray();
        int start = 0;
        int end = s1.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}


// import java.util.Scanner;

// public class Check_if_a_given_String_is_a_Palindrome {
// public static void main(String[] args) {
// System.out.println("Enter the String:- ");
// Scanner sc=new Scanner(System.in);
// String s1= sc.nextLine();
// String s2= "";

// for(int i=s1.length()-1; i>=0;i--){
// s2+=s1.charAt(i);
// }

// if(s1.equals(s2)){
// System.out.println("String is palindrome");
// }
// else{
// System.out.println("String is not palindrome");
// }
// }
// }

// import java.util.Scanner;

// public class Check_if_a_given_String_is_a_Palindrome {
// public static void main(String[] args) {
// System.out.println("Enter the String:- ");
// Scanner sc=new Scanner(System.in);
// String s1= sc.next();

// StringBuilder sb=new StringBuilder(s1);
// sb.reverse();
// String rev= sb.toString();

// if(s1.equals(rev)){
// System.out.println("String is palindrome");
// }
// else{
// System.out.println("String is not palindrome");
// }
// }
// }