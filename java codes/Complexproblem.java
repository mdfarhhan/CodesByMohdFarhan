import java.lang.Math;

class Complexproblem {
    public static void main(String ar[]) {
        int re = 8;
        int im = 12;
        double mg;
        mg = Math.sqrt((re * re) + (im * im));
        System.out.println("Magnitude = " + mg + " Argument = tan^-1 " + im + "/" + re);
    }
}