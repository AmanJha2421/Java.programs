#include<stdio.h>

int riskScore(int n);
int main(){
    int n;
    printf("Enter a transaction id to know its score : ");
    scanf("%d",&n);
    int s = riskScore(n);
    printf("Score : %d\n",s);
    if(s<0){
        printf("Risky");
    }
    else if((s>=0)&&(s<50)){
        printf("Moderate");
    }
    else if(s>=50){
        printf("Safe");
    }
}

int riskScore(int n){
    int score = 0;
    if(n%10==0){
        return score + riskScore(n/10);
    }
    else if(n%2==0){
        score = score+(n%10)*(n%10);
    }
    else if(n%2!=0) {
        score = score-((n%10)*(n%10)*(n%10));
    }
    if(n>10){
    return score+riskScore(n/10);
    }
    else{
        return score;
    }
}