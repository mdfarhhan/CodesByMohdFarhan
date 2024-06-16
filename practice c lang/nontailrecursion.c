#include<stdio.h>
void fun(int n)
{
    if(n==0)
        return;
    fun(n-1);
    printf("%d\t",n);

}




int main()

{
    fun(45);

    return 0;
}

