#include<stdio.h>

void swap(int *a, int *b);
int max(int *a,int *b);

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
    // int a = 5;
    // int b = 6;
    // printf("a=%d, b=%d\n",a,b);
    // swap(&a,&b);
    // printf("a=%d, b=%d",a,b);
    // printf("Greatest between %d and %d is %d",a,b,max(&a,&b));
    // int n;
    // scanf("%d",&n);
    // int arr[n];
    // for(int i=0;i<n;i++){
    //     scanf("%d",&arr[i]);
    // }
    // for(int i=0;i<(n/2);i++){
    //     int *ptr1 = &arr[i];
    //     int t = *ptr1;
    //     int *ptr2 = &arr[n-i-1];
    //     *ptr1 = *ptr2;
    //     *ptr2 = t;
    // }
    // for(int i=0;i<n;i++){
    //     printf("%d ",arr[i]);
    // }
    char letters[26];
    char *ptr = letters;
    for(int i=0;i<26;i++){
        *(ptr+i) = 'A' + i; 
    }
    for(int i=0;i<26;i++){
        printf("%c ",*(ptr+i));
    }
    return 0;
}

void swap(int *a, int *b){
    int t= *a;
    *a = *b;
    *b = t;
} 
int max(int *a,int *b){
    if(*a>*b){
        return *a;
    }
    else{
        return *b;
    }
}