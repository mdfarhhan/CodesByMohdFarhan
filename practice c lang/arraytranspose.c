#include<stdio.h>
#include<conio.h>
int main()
{
 int i,j,a[i][j];
 printf("enter the elements in matrix ");
 for(i=0;i<3;i++)
 {
     for(j=0;j<3;j++)
     {
         scanf("%d",&a[i][j]);
     }
 }

 printf("matrix after transpose ");
 for(i=0;i<3;i++)
 {
     for(j=0;j<3;j++)
     {
       printf("%d\t",a[j][i]);
     }
     printf("\n");

 }


    return 0;
}
