public class Reverseselectionsort {
    public static void main(String[] args) {
        int ar[]={73,32,12,8,3,1};
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<6;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }


        }
        for(int k=0;k<6;k++)
        {
            System.out.print(ar[k]+" ");
        }
    }    
}
