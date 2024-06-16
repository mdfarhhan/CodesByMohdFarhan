#include<stdio.h>
#include<conio.h>
int add(int a,int b)
{
    return (a+b);
}

int main()
{
    int m,n,sum;
    printf("enter the value of m ");
    scanf("%d",&m);
    printf("enter the value of n ");
    scanf("%d",&n);
    sum=add(m,n);

    printf("%d",sum);
    return 0;
}

