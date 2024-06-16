import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisapperadNoinArray {
    public static void main(String[] args) {
        int[] arr={5,5,1,10,10,2,3,1,7,9,8,8};
        List <Integer> arrans=sort(arr);
        System.out.println(arrans);
    }
    static List<Integer> sort(int[] arr){
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
        System.out.println(Arrays.toString(arr));
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j <arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        
    }
    return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
