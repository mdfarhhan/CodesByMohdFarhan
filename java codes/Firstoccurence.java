import java.util.*;
public class Firstoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        sc.close();
        for(int j=0;j<n;j++)
        {
            if(ar[j]==key)  
            {
                System.out.println(j);
            }
        }

    }
}
