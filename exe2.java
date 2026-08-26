import java.util.Scanner;
import java.util.Random;
class exe2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("INSTRUCTIONS : \n 1 = rock\n 2 = paper\n 3 = scissors\n 4 = To end the match\n Type \"YES\" to play");
        String s = sc.next();
        int c = 0;
        do{
        int a = rnd.nextInt(1,4);
        System.out.println("Choose a number");
        int b = sc.nextInt();
        if((a==1) && (b==2))
        {
        System.out.println("You won");
        System.out.println("You choose : Paper\nCom choose : rock ");
        }
        else if((a==1) && (b==3))
        {
        System.out.println("Com won");
        System.out.println("You choose : Scissors\nCom choose : rock ");
        }
        else if((a==2) && (b==1))
        {
        System.out.println("Com won");
        System.out.println("You choose : rock\nCom choose : Paper ");
        }
        else if((a==2) && (b==3))
        {
        System.out.println("You won");
        System.out.println("You choose : Scissors\nCom choose : Paper ");
        }
        else if((a==3) && (b==1))
        {
        System.out.println("You won");
        System.out.println("You choose : rock\nCom choose : Scissors ");
        }
        else if((a==3) && (b==2))
        {
        System.out.println("Com won");
        System.out.println("You choose : Paper\nCom choose : Scissors ");
        }
        else if(b==4){
            System.out.println("Match ended");
            break;

        }
        else 
        {
            System.out.println("Tied");
        }
        
        }while(c!=4);
    }
}