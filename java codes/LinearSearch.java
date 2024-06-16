import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of terms in array:");

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the key you want to search: ");
        int key = in.nextInt();
        int ans = linearserch(arr, key);
System.out.println("index of element is: "+ans);
        
    }
    static int linearserch(int[] arr, int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;

    }
}
