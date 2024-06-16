import java.util.Scanner;
class Main{

    public static void main(String ar[]) {
    System.out.println("first programm!");
    Scanner in = new Scanner(System.in); 
    System.out.println("enter the value of a: ");
    int a = in.nextInt();
    System.out.println("enter the value of b: ");
    int b = in.nextInt();
    System.out.print(a+b);
    }
}