#include<stdio.h>
#include<string.h>
int main(){
    FILE *fpntr;
    fpntr = fopen("hi.txt","r");
    char ch[100];
    // fscanf(fpntr,"%s",&ch);
    // printf("%s",ch);
    // fscanf(fpntr,"%s",&ch);
    // printf("%s",ch);
    // fclose(fpntr);
    // fprintf(fpntr,"%s","Good");
    // fputs("Morning",fpntr);
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));
    printf("%c",fgetc(fpntr));


    return 0;
}