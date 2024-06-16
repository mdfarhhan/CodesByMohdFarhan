public class SortArray {
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main (String ar[])
    {
        int arr[] = {25,34,54,21,12,3,4,0,6};
        System.out.println("before sorting ");
        printArray(arr);
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}
