#include<stdio.h>
int f2(int a){
 int b=0;
 b=b+5;
 return a*b;
}
int f1(int a){
 int b;
 b=f2(a);
 return a*b;
}
int main(){
 int i, a=5, b=4;
 for(i=0;i<2;i++){
 b-= f1(a)-f2(a);
 printf("%d\t", b);
 }
 return 0;
}
