import java.util.*;
public class GreatestinanArray {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    for(int j=1;j<n;j++)
    {
        if(ar[j]>ar[0])
        {
            ar[0]=ar[j];
        }
    }
    System.out.println("The Greatest No. in Array is "+ar[0]);
    sc.close();
}
}
