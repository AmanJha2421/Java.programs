#include<stdio.h>
#include<math.h>

int sum(int n);
int factorial(int n);
float pctg();
int fibbonaci(int n);
int sumOfTwo(int n);
float sqroot(float n);

int main(){
    int num;
    scanf("%d",&num);
    // int y = factorial(num);
    // printf("%d",y);
    // float y = pctg();
    // printf("%f",y);
    // int x = fibbonaci(num);
    // printf("%d",x);
    // return 0;
    printf("%f",sqroot(num));
}

int sum(int n){
    int x;
    if(n==1){
        return 1;
    }
    else{
        return n + sum(n-1);
    }
}
int factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    else {
        return n*factorial(n-1);
    }
}
float pctg(){
    float m,s,e;
    printf("Enter your marks : \nMaths :");
    scanf("%f",&m);
    printf("\nScience : ");
    scanf("%f",&s);
    printf("\nEnglish : ");
    scanf("%f",&e);
    float sum = (e+s+m)/3;
    
    return sum;
}
int fibbonaci(int n){
    if(n==1){
        return 0;
    }
    else if(n==2 || n==3){
        return 1;
    }
    else{
        int f = fibbonaci(n-1) + fibbonaci(n-2);
        return f;
    }
}
int sumOfTwo(int n){
    int y = n%10;
    if(y<1){
        return 0;
    }
    else{
        return y+sumOfTwo(n/10);
    }
}
float sqroot(float n){
    float y = pow(n,1.0/2.0);
    return y;
}
