import java.util.Scanner;

public class CurrencyExch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rupee to convert in doller: ");
        double curr = in.nextDouble();
        double doller = curr/74.96;
        System.out.println("money in doller is " + doller);

    }
}
