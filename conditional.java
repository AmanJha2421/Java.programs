import java.util.Scanner;
class conditional
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        // if(a>33)
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }


        switch(a)
        {
            case 13,14: System.out.println("You're in 9th class ");
            break;
            case 15: System.out.println("You're in 10th class ");
            break;
            case 16: System.out.println("You're in 11th class ");
            break;
            case 17: System.out.println("You're in 12th class ");
            break;
            case 18: System.out.println("You're in finally in college ");
            break;
            default : System.out.println("please enter a number betweeen 14 - 18");
        }
        
    }
}