public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr={5,4,1,6,10,2,3,3,7,9,8,};
        System.out.println(duplicatenums(arr));
        
        System.out.println();
    }

    static int duplicatenums(int[] arr){
        int i=0;
        while(i<arr.length){
        if (arr[i]!=i+1) {
            int currentindex=arr[i]-1;
            if(arr[i]!=arr[currentindex]){
                swap(arr, i, currentindex);
            }
            else{
                return arr[i];
            }
        }
        else{
            i++;
        }
        
        
        }
        return -1;
        
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
