import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println("after swaping: ");
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);


    }
}
