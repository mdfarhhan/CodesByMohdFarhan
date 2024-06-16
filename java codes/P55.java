import java.util.Scanner;

public class P55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = in.nextInt();
        int hour = n/3600;
        int minutus = n%60;
        int seconds = minutus%60;
        System.out.println(hour+":"+minutus+":"+seconds);
    }
}
