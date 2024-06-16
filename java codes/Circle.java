import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        double Area = 3.14*radius*radius;
        System.out.println("Area is "+ Area);
        double Perimeter = 2*3.14*radius;
        System.out.print("perimerter is "+ Perimeter);
    }
}
