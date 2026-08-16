import java.util.Scanner;

class ti
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println(sc.hasNextInt()); //to check if the entered input is integer 
        // System.out.println(sc.hasNextFloat()); //to check if input is a float
        System.out.println("WRITE 1ST NUMBER :");
        int a = sc.nextInt();
        System.out.println("WRITE 2ND NUMBER :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}