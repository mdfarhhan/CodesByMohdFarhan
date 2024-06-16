import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of side of hexagon: ");
        double d = in.nextDouble();
        System.out.println("Are of Hexagon is: "+Areahexagon(d));
    }
    static double Areahexagon(double l)
    {
        double a = (6*l*l)/(4*Math.tan(Math.PI/6));
        return a;
    }
}
