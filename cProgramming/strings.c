#include<stdio.h>
#include<string.h>

int main(){

        // char name[] = "aman";
        // for(int i=0;name[i]!='\0';i++){
        // printf("%c",name[i]);
        // }
        // scanf("%s",name);
        // printf("name : %s",name);
        char name[100];
        char salt[] = "123";
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
        scanf("%s",name);
        strcat(name,salt);
        puts(name);
        
    return 0;
}