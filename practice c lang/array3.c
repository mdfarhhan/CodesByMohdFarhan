#include<stdio.h>
#include<conio.h>
int main()
{
    int a[5],i,j,temp;
    printf("\n enter 5 elements");
    for(i=0;i<=4;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n array before sorting");
    for(i=0;i<=4;i++)
    {
        printf("\t%d",a[i]);
    }
    for(i=1;i<=5;i++)
    {
        temp=a[i];
        j=i-1;
        while(j>=0&&a[j]>temp)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;
    }
    printf("\n array after sorting");
    for(i=1;i<=4;i++)
    {
        printf("\t%d",a[i]);

    }
    return 0;
}
