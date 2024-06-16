public class CharacterSorting
{
    public static void main(String[] args) {
        
        char ch[]={'Z','O','R','L','D'};
        int a[]=new int[5];

        for(int i=0;i<5;i++)
        {
            
            a[i]=ch[i];
        }
           for(int j=0;j<5;j++)
           {
            for(int k=0;k<4;k++)
            {
              if(a[k]>a[k+1])
              {
                  int temp=a[k];
                  a[k]=a[k+1];
                  a[k+1]=temp;
              }
            }
        }
       
            for(int l=0;l<5;l++)
            {   ch[l]=(char)a[l];
                System.out.print(ch[l]+" ");
            }

       

    }
}




