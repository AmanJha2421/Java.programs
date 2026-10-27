#include<stdio.h>

void swap(int *a, int *b);

int main(){
    // int age = 19;
    // int *ptr = &age;
    // int age1 = *ptr;
    // printf("%u\n",&age);
    // printf("%p\n",ptr);
    // printf("%p\n",&age1);
    // printf("%p\n",&ptr);
    // int **pptr = &ptr;
    // printf("%d",**pptr);
    int a = 5;
    int b = 6;
    printf("a=%d, b=%d\n",a,b);
    swap(&a,&b);
    printf("a=%d, b=%d",a,b);
    return 0;
}

void swap(int *a, int *b){
    int t= *a;
    *a = *b;
    *b = t;
} 