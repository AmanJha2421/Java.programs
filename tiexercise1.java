import java.util.Scanner;

class exercise
{
    public static void main(String []args)
    {
        // QUES : Write a program to calculate percentage of a given student in cbse board exam. His marks from 5 subjects must be taken as user input

        Scanner sc = new Scanner(System.in);
        System.out.println("If u want to calculate your percentage then type 'YES'");
        String str = sc.next();
        System.out.println("Write your math marks : ");
        int a = sc.nextInt();
        System.out.println("Write your science marks : ");
        int b = sc.nextInt();
        System.out.println("Write your english marks : ");
        int c = sc.nextInt();
        System.out.println("Write your himdi marks : ");
        int d = sc.nextInt();
        System.out.println("Write your sst marks : ");
        int e = sc.nextInt();
        float percentage = (a+b+c+d+e)*100/500f;
        System.out.println("Your percentage is : " + percentage);
    }


}