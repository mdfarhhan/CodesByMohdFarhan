public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,9,22,33,44,55,66};
        int key = 8;
        System.out.println(ans(arr, key));
    }
    static int ans(int[] arr,int key)
    {
        int start = 0;
        int end = 1;
        while(key>arr[end]){
            int temp = end +1;
            end = end+(end-start+1)*2;
            start = temp;

        }
        return Search2(arr,key,start,end);
    }
    static int Search2(int[] arr, int key,int s,int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}
