import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String str,rev="";
        Scanner in = new Scanner(System.in);
        System.out.print("enter a String: ");
        str = in.nextLine();
        int len = str.length();
        for(int i =len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str+" is a palindrome number.");
        }
        else
        {
        System.out.println(str+" is not a palindrome number.");
        }

    }
}
