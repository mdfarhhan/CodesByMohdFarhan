import java.util.Scanner;

public class greating {
    public static void main(String[] args) {
        String greet = "Hello ";
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.nextLine();
        System.out.println(greet + name+ "\n"+"\t"+ "Have a nice day!");

    }
}
