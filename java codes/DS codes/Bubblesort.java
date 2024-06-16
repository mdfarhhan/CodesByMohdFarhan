class Bubblesort {
public static void main (String ar[])
{
int x[]={11,2,3,45,3,67};
int t;
for(int i=0;i<6;i++)
{
for(int j=0;j<6-i-1;j++)
{
if(x[j]>x[j+1])
{
t=x[j];
x[j]=x[j+1];
x[j+1]=t;
}
}
}
for(int i=0;i<6;i++)
{
System.out.print(" "+x[i]);
}
}
}