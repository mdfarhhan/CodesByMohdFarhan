import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,33,14,0,5,4};
        //Bubble(arr);
        //Selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i-1;
            int maxindex = getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
