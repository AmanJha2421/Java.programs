import java.util.Random;
import java.util.Scanner;
class game{
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    int n;
    int userInput;
    int guesses = 0; 
    public  game(){
         n = rnd.nextInt(1,1001);
    }
     public int takeUserInput(){
        System.out.println("Choose a number : ");
            userInput = sc.nextInt();
            return userInput;
        }
    public void IsCorrectNumber(){
        if(n==userInput){
            System.out.printf("You gussed it correctly : %d\n", n );
            System.out.println("Thanks for playing.");
        }
        else if((n>userInput)){
            System.out.println("Higher");
        }
        else if((n<userInput)){
            System.out.println("Lower");
        }
        else {
            System.out.println("Please enter a number between 1-1000!");
        }
    }      
    public void setNoOfGuesses(int i){
        guesses = i;
    } 
    public int noOfGuesses(){
        return guesses;
    }
}

public class exe3 {
    public static void main(String[] args) {
        // game number = new game();
        game number = new game();
        System.out.println("The number you have to guess is between 1-1000");

        for(int i=1;number.n!=number.userInput;i++){
            number.takeUserInput();
            number.IsCorrectNumber();
            number.setNoOfGuesses(i);
        };
        System.out.printf("No of guesses used : %d",number.noOfGuesses());


    }
}
