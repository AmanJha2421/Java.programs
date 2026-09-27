#include<stdio.h>
int main(){
    int n;
    printf("Enetr a number to check if its prime or not : ");
    scanf("%d",&n);
    for(int i=2;i<n;i++){
        if(n%i==0){
            printf("%d is not Prime",n);
            break;
        }
        if(i==n-1){
            printf("Is prime");
        }
    }
}