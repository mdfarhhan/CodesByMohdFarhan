import java.util.Scanner;

public class inputTill0Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max;
        int n=in.nextInt();
        max=n;
        while(n !=0){
            if(n>max){
                max=n;
            }
            System.out.println("enter again a number:   and to exit enter 0  ");
            n= in.nextInt();
        }
        System.out.println("maximum number till now: "+max);

    }
}
