import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number to print table:");
        int n = in.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }

    }
}
