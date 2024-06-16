import java.util.Scanner;

public class lar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println("largest number is"+ a);
        }
        else{
            System.out.println("largest number is "+ b);
        }
    }
}
