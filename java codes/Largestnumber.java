import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("number 1 is greater "+a);

            }
            else{
                System.out.println("number 3 is greater "+c);
            }
        }
        else if (b>c)
        {
            System.out.println("number 2 is greater " + b);
        } 
        else{
            System.out.println("number 3 is greater "+c);
        }
    }
}
