import java.util.*;
public class Prime {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n=sc.nextInt();
           sc.close();
           int i;
           for(i=2;i<n;i++)
           {
               if(n%i==0)
               {
                   System.out.println("Entered Number is Not a Prime Number");
                   break;
               }
            }
           if(i==n || n==1)
           {
            System.out.println("Entered Number is a Prime Number");
           }
       }
}
