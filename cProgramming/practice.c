#include<stdio.h>

int main(){
    // 1
/*    printf("Enter a number : ");
    int a;
    scanf("%d",&a);
    printf("%d",a%4);
*/
    // 2
/*    printf("Emter 3 numbers : ");
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    float f = (a+b+c)/3;
    printf("%f",f);
*/
    // 3
/*    int a;
    scanf("%d",&a);
    printf("%d",a>=0 && a<10);
*/
    // 4(TERNARY OPERATOR FOR CONDITIONS)
/*    int a;
    scanf("%d",&a);
    (a>21) ? printf("YES") : printf("No");
*/
    // 5
    char a;
    scanf("%c",&a);
    if(a>='A' && a<='Z'){
        printf("Upper case\n");
    }
    else if(a>='a' && a<='z'){
        printf("Lower case\n");  
    }
    else{
            printf("Not a charater\n");
        }

    return 0;
}