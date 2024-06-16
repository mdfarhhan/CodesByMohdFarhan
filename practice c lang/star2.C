#include<stdio.h>
#include<conio.h>
int main()
{
    int num[5]={1,2,3,4,5};
    printf("\n num[0]=%d address:%u", num[0] &num[0]);
    printf("\n num[1]=%d address:%u", num[1] &num[1]);
    printf("\n num[2]=%d address:%u", num[2] &num[2]);
    printf("\n num[3]=%d address:%u", num[3] &num[3]);
    printf("\n num[4]=%d address:%u", num[4] &num[4]);


return 0;
}

