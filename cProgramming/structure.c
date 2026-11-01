#include<stdio.h>
#include<string.h>


struct student{
    char name[100];
    int rollNo;
    float Cg;
};
typedef struct subject{
    char subName[100];
    int totalChp;
}sub;
struct address{
    int houseNumber;
    char block;
    char city[100];
    char state[100];
};
void print(struct address add);

int main(){
    // struct student aman;
    // strcpy(aman.name,"Aman jha");
    // aman.Cg = 9.00;
    // aman.rollNo = 45;
    // struct student aachal = {"Aachal soni",24,9.05};
    // struct student fatima = {"Fatima khatoon",21,9.10};
    // struct student *ptr = &fatima;
    // printf("Name : %s\nRoll No : %d\nCGPA : %.2f\n",aachal.name,aachal.rollNo,aachal.Cg);
    // printf("Name : %s\nRoll No : %d\nCGPA : %.2f\n",aman.name,aman.rollNo,aman.Cg);
    // printf("Name : %s\nRoll No : %d\nCGPA : %.2f\n",(*ptr).name,(*ptr).rollNo,(*ptr).Cg);
    // sub chemistry = {"Chemestry",14};
    // sub math = {"Math",15};
    // sub physics = {"Physics",13};
    // printf("Name = %s\nTotal Chapters = %d\n",chemistry.subName,chemistry.totalChp);
    // printf("Name = %s\nTotal Chapters = %d\n",math.subName,math.totalChp);
    // printf("Name = %s\nTotal Chapters = %d\n",physics.subName,physics.totalChp);

    struct address aman = {21,'A',"Rohini","delhi"};
    struct address anjali = {24,'B',"Lucknow","UP"};
    struct address fatima = {2108,'C',"MUjaffarpur","Bihar"};
    struct address aachal = {2410,'D',"seoul","Korea"};
    struct address ashu = {2110,'E',"Madhubani","Bihar"};
    print(aman);
    print(anjali);
    print(fatima);
    print(aachal);
    print(ashu);



    return 0;    
}
void print(struct address add){
    printf("House no. = %d\nBlock = %c\nCity = %s\nState = %s\n",add.houseNumber,add.block,add.city,add.state);
}