#include <stdio.h>

int main(){
    // for(char a = 'a';a<='z';a++){
    //     printf("%c\n", a); 
    // // }
    // int n;
    // scanf("%d", &n);
    // int i = 1;
    // while(i<=n){
    //     printf("%d\n",i);
    //     i++;
    // }

    // for(int j=1;j<=n;j++){
    //     printf("%d\n",j);
    // }
    // int sum = 0;
    // for(int j=1;j<=n;j++){
    //     sum+=j;
    // }
    // printf("%d\n",sum);

    // for(int j=n;j>0;j--){
    //     printf("%d\n",j);
    // }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
