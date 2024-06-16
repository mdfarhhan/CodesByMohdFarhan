#include<stdio.h>
#include<conio.h>
int fact(int n)
{
    if(n==1)
        return 1;
    else

        return n*fact(n-1);


}



int main()
{
 int n;
 printf("enter the number: ");
 scanf("%d",&n);
 printf("the fact of the number %d is %d",n,fact(n));

}
