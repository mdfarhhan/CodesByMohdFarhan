#include<stdio.h>
#include<conio.h>
int main()
{
   int a[10],i,s,f=0;
   for(i=o;i<10;i++)
   {
       printf("\n enter the number to be stored ");
       scanf("%d",&a[i]);
   }
   printf("\n enter the number you want to search= ");
   scanf("%d",&s);
   for(i=0;i<10;i++)
   {
       if(a[i]==s)
       {
           printf("elements present at %d position ");
          f=1;
       }
   }
    if(f==0)
    {
        printf("element is not found");
    }
return 0;
}
