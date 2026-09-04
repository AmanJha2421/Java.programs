class animals{
    public void walk(){
        System.out.println("(animal)Walking...");
    }
    public void speak(){
        System.out.println("(animal)Barking...");
    }
}
class humans extends animals{
    public void laugh(){
        System.out.println("(human)laughing...");
    }
    public void speak(){
        System.out.println("(human)Talking...");
    }
}


public class dynamicMehtodDispatch {
    public static void main(String[] args) {
        // animals ani = new animals();
        // ani.walk();
        // ani.speak();


        // humans hum = new humans();
        // hum.laugh();
        // hum.speak();


        animals comb = new humans(); // reference of animal but obj of humans
        comb.walk();
        comb.speak();
       // comb.laugh();  //not allowed
    }
    
}
