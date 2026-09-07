#include<stdio.h>
void hello();
int sum(int x,int y);
float C_area(int r);
int main(){
    hello();
    int a,b;
    scanf("%d %d",&a,&b);
    int s = sum(a,b);
    printf("%d\n",s);
    float area = C_area(7);
    printf("%f",area);
    return 0;
}
void hello(){
    printf("Hello world\n");
}
int sum(int x,int y){
    return x+y;
}
float C_area(int r){
    float pi = 3.14;
    return pi*r*r;
}