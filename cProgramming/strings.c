#include<stdio.h>
#include<string.h>
void slice(char arr[] ,int n, int m);
void trim(char arr[]);

int main(){

        // char name[] = "aman";
        // for(int i=0;name[i]!='\0';i++){
        // printf("%c",name[i]);
        // }
        // scanf("%s",name);
        // printf("name : %s",name);
        // char name[100];
        // char salt[] = "123";
        // gets(name);
        // puts(name);
        // char ch;
        // int i=0;
        // while(ch !='\n'){
        //     scanf("%c",&ch);
        //     name[i] = ch;
        //     i++;
        // }
        // name[i] = '\0';
        // puts(name);
        // scanf("%s",name);
        // strcat(name,salt);
        // puts(name);
        // char num[] = "91874587346592874592346057410457187";
        // char n;
        // scanf("%c",&n);
        // int count=0;
        // for(int i=0;num[i]!='\0';i++){
        //     if(num[i]==n){
        //         count++;
        //     }
        // }
        // printf("%c comes %d times in the list %s",n,count,num);

        // char array[100];
        // scanf("%s",&array);
        // slice(array,3,6);
        char arr[100];
        fgets(arr,100,stdin);
        trim(arr);
        
    return 0;
}

void slice(char arr[], int n, int m){
    char arr1[100];
    for(int i=n;i<m;i++){
        arr1[i-n] = arr[i];
    }
    arr1[m-n] = '\0';
    puts(arr1);
}
void trim(char arr[]){
    int j = 0;
    char arr1[100];
    for(int i=0;arr[i]!='\0';i++){
        if(arr[i]!=' '){
            arr1[j] = arr[i];
            j++;
        }
    }
    arr1[j]='\0';
    puts(arr1);
}