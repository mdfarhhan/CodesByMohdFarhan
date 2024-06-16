public class Min {
    public static void main(String[] args) {
        int[] arr = {23,45,3,4,5,25,-23,3,5,5,6,57,1,5,3,5,3,6};
        int ans = min(arr);
        
        System.out.println("Minimum number is: "+ans);
        
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
