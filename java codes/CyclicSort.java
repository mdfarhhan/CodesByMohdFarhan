import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,6,4,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
        int currentindex=arr[i]-1;
        if(arr[i]!=arr[currentindex]){
            swap(arr, i, currentindex);
        }
        else{
            i++;
        }
    }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
