import java.util.Scanner;
class InsertionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        for(int i=1;i<n;i++)
        {   int current=ar[i];
            int j=i-1;
            while( j>=0 && ar[j]>current)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=current;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        
    }
}









