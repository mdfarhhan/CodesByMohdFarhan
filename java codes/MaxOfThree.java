import java.util.Scanner;

public class MaxOfThree
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c= Sc.nextInt();
        Sc.close();
        if(a>b && a>c)
        {
            System.out.println("Maximum of Three Number is:"+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("Maximum of Three Number is:"+b);
        }
       else{
        System.out.println("Maximum of Three Number is:"+c);
       }
        
        


    }
}



