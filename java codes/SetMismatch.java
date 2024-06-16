import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
        int currentindex=arr[i]-1;
        if(arr[i]<arr.length && arr[i]!=arr[currentindex]){
            swap(arr, i, currentindex);
        }
        else{
            i++;
        }
    }
    for (int index = 0; index < arr.length; index++) {
        if(arr[index]!=index+1){
            return new int[] {arr[index],index+1};
        }
    }
    return new int[] {-1,-1};
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
