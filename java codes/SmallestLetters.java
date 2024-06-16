public class SmallestLetters {
    public static void main(String[] args) {
        char[] arr = {'b','d','g','h','k','n','r'};
        char key = 'k';
        char ans = SmallestLetter(arr, key);
        System.out.println(ans);

    }

    static char SmallestLetter(char[] arr, char key) {
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            int mid=s+(e-s)/2;
            if(key<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return arr[s%arr.length];

    }
}
