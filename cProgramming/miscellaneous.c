#include<stdio.h>
#define pi 3.14159
#define circleArea(n) pi*n*n
extern i;
int main(){
    printf("Current Time is : %s\n",__TIME__);
    printf("Current Date is : %s\n",__DATE__);
    printf("area = %.2f\n",circleArea(10));
    int a,b,c;
    scanf("%d\n %d\n %d",&a,&b,&c);
    ((a>b)&&(a>c))?printf("\n%d is greatest",a):(b>c)?printf("%d is greatest",b):printf("%d is greatest",c);

}