import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a year to check it is leap year or not: ");
        int year = in.nextInt();
        if(year%400==0)
        {
            System.out.println("entered number is a leap year");
        }
        else if(year%100==0)
        {
            System.out.println("entered number is not a leap year ");
        }
        else if(year%4==0)
        {
            System.out.println("entered number is a leap year");
        }
        else{
            System.out.println("entered number is not a leap year ");
        }
    }
}
