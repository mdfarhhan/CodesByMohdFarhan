public class Selection_sort
{
public static void main(String[] ar)
{
int a[]={8,7,6,5,4,3,2,1};
System.out.println("before Sorting:");
for (int i=0;i<8;i++)
{
System.out.print(a[i]+"");
}
System.out.println();
for(int i=0;i<8;i++)
{
for(int j=i+1;j<8;j++)
{
if(a[i]>a[j])
{
int c=a[i];
a[i]=a[j];
a[j]=c;
}
}
}
System.out.println("After sorting: ");
for(int i=0;i<8;i++)
{
System.out.print(a[i]+"");
}
}
}
