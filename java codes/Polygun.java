import java.util.Scanner;

public class Polygun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of side of polygun: ");
        float s = in.nextFloat();
        System.out.println("enter the No. of side of polygun: ");
        int n = in.nextInt();
        System.out.println("Area of Polygun is : "+Areapolygun(s,n));
    }
    static double Areapolygun(float s,int n)
    {
        double a = (n*s*s)/(4*Math.tan(Math.PI/n));
        return a;
    }
}
