class MinimizeStorage {
    public static void main(String[] args)
    {
        int arr[]={7,6,2,9,3};
        short sh[]=new short[arr.length];
        for(int k=0;k<arr.length;k++)
        {
            sh[k]=(short)arr[k];
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(sh[j]+",");
        }
    }
}
