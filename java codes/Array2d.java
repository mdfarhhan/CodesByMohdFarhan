public class Array2d {
    public static void main(String[] args) {
        int[][] arr ={{45,66,35,87},{35,7,5,45,67},{5,3,6,7,8},{90,98,77,55,11,33}};
        int key = 90;
        System.out.println("key is the index of "+search(arr,key));
    }
    static int search(int[][] arr,int t)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==t)
                {
                    return j;
                }
            }
        }
        System.out.println("element not found: ");
        return -1;
    }

}
