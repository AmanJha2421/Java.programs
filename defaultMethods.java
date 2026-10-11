import java.util.Scanner;

interface kitchen{
    default void aboutK(){
        System.out.println("\n\nKITCHEN ITEMS\n\n");
    }
    void stoveAndGas();
    void fridge();
    void oven();
}
interface washroom{
    default void aboutW(){
        System.out.println("\n\nWASHROOM ITEMS\n\n");
    }
    String[] Products();
    void tap();
    void flush();
}
interface bedroom{
    default void aboutB(){
        System.out.println("\n\nBEDROOM ITEMS\n\n");
    }
    void tv();
    void bed();
    void computer();
    String[] clothes();
}

class home implements kitchen,washroom,bedroom{
    public void stoveAndGas(){
        System.out.println("turning ON gas...");
    }
    public void fridge(){
        System.out.println("Opening fridge...");
    }
    public void oven(){
        System.out.println("Cooking food in oven...");
    }
    public String[] Products(){
        System.out.println("beauty products :");
        String[] Products =  {"shampoo","body wash","soap","facewash"};
        return Products;
    }
    public void tap(){
        System.out.println("Opening Tap...");
    }
    public void flush(){
        System.out.println("Flushing toilet...");
    }
    public void tv(){
        System.out.println("Turning the TV On..");
    }
    public void bed(){
        System.out.println("Resting on bed");
    }
    public void computer(){
        System.out.println("Turning the computer ON...");
    }
    public String[] clothes(){
        System.out.println("Types of clothes in wardrobe");
        String[] clothes = {"Henley","Polo","Straingt fit","Baggy","Hat"};
        return clothes;
    }
}

// INHERITENCE IN INTERFACES

interface set1{
    void ques1();
    void ques2();
}
interface set2 extends set1{
    void ques3();
    void ques4();
}
class exam implements set2{
    Scanner sc = new Scanner(System.in);
    public void ques1(){
        System.out.println("1. what is 9+15?");
        int ans1 = sc.nextInt();
        if(ans1 == 24){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
        System.out.println("Ques 1 is Solved");
    }
    public void ques2(){
        System.out.println("2. what is 10+12?");
        int ans2 = sc.nextInt();
        if(ans2 == 22){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
        System.out.println("Ques 2 is Solved");
    }
    public void ques3(){
         System.out.println("3. what is 13-2?");
        int ans3 = sc.nextInt();
        if(ans3 == 11){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
        System.out.println("Ques 3 is Solved");
    }
    public void ques4(){
         System.out.println("4. what is 4*7?");
        int ans4 = sc.nextInt();
        if(ans4 == 28){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
        System.out.println("Ques 4 is Solved");
    }
}

public class defaultMethods {
    public static void main(String[] args) {
        
        home myhome = new home();
        myhome.aboutW();
        String[] p = myhome.Products();
        for(String e : p){
            System.out.println(e);
        }
        myhome.tap();
        myhome.flush();
        myhome.aboutB();
        myhome.bed();
        String[] c = myhome.clothes();
        for(String e : c){
            System.out.println(e);
        }
        myhome.computer();
        myhome.tv();
        myhome.aboutK();     
        myhome.fridge();
        myhome.oven();
        myhome.stoveAndGas();

        exam CO = new exam();
        CO.ques1();
        CO.ques2();
        CO.ques3();
        CO.ques4();
        
        
    }
}
