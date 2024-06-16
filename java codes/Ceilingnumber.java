public class Ceilingnumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 9, 10, 13, 14, 16, 17, 22, 23, 24, 25, 26, 33, 34, 35, 56, 58 };
        int key = 15;
        int ans = Ceiling(arr, key);
        System.out.println(arr[ans]);

    }

    static int Ceiling(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;

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
        return s;

    }
}
