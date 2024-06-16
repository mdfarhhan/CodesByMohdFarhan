#include<stdio.h>
#include<conio.h>
int main()
{
    int n,i,j,k;
    printf("Enter the number of row you want to print ");
    scanf("%d",&n);
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=n-i;j++)
        {
            printf(" ");
        }
        for(k=1;k<=i;k++)
        {
            printf("$");
        }
        printf("\n");
    }

return 0;
}
