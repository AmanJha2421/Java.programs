#include<stdio.h>

void swap(int *a, int *b);
int max(int *a,int *b);
int fibonacci(int n);

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
    // char letters[26];
    // char *ptr = letters;
    // for(int i=0;i<26;i++){
    //     *(ptr+i) = 'A' + i; 
    // }
    // for(int i=0;i<26;i++){
    //     printf("%c ",*(ptr+i));
    //     if(i==25){
    //         printf("\n");
    //     }
    // }
    // for(int i=0;i<13;i++){
        
    //     char *ptr = &letters[i];
    //     char temp = *ptr;
    //     char *ptr2 = &letters[25-i];
    //     *ptr = *ptr2;
    //     *ptr2 = temp;
    //     ptr++;
    // }
    // for(int i=0;i<26;i++){
    //     printf("%c ",*(ptr+i));
    // }
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=1;i<=n;i++){
        arr[i-1]=fibonacci(i);
    }
    for(int i=0;i<n;i++){
        printf(" %d",arr[i]);
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
int fibonacci(int n){
    if(n==1){
        return 0;
    }
    else if(n==2){
        return 1;
    }
    else{
    int y = fibonacci(n-1)+fibonacci(n-2);
    return y;
    }
}