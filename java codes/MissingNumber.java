public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={5,6,4,2,3,1,0};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
        int currentindex=arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[currentindex]){
            swap(arr, i, currentindex);
        }
        else{
            i++;
        }
    }
    for (int index = 0; index < arr.length; index++) {
        if(arr[index]!=index){
            return index;
        }
    }
    return arr.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
