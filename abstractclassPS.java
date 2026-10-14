import java.util.Scanner;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("Writting...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing nib...");
    }
}
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human1 extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
abstract class TelePhone{
    abstract void ring(long number);
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    public void ring(long number){
        System.out.printf("Call from : %d\n",number);
    }
    public void lift(){
        System.out.println("Picking UpThe Call");
    }
    public void disconnect(){
        System.out.println("Disconnecting the call");
    }
    void call(long number){
        System.out.printf("Calling : %d\n",number);
    }
}
interface SmartTVremote{
    void voiceCommand();
    void OTT();
    void YouTube();
}
interface TVremote extends SmartTVremote{
    void select();
    void search();
    void volumeInc();
    void volumeDec();
}
class TV implements TVremote{
    public void voiceCommand(){
        System.out.println("Please speak to give a command");
    }
    public void OTT(){
        System.out.println("Select an OTT channel\n\tJioHotstar\n\tNetflix\n\tSonyLiv\n\tAmazonPrime");
    }
    public void YouTube(){
        System.out.println("Opening youTube");
    }
    public void select(){
        System.out.println("Selecting channel");
    }
    public void search(){
        System.out.println("Search by typing...");
    }
    public void volumeInc(){
        System.out.println("Increasing voulume");
    }
    public void volumeDec(){
        System.out.println("Decreasing volume");
    }
}

public class abstractclassPS {
    public static void main(String[] args) {
        
        FountainPen pen1 = new FountainPen();
        pen1.write();
        pen1.refill();
        pen1.changeNib();

        human1 adam = new human1();
        adam.jump();
        adam.bite();
        adam.sleep();
        adam.eat();

        SmartTelePhone tele1 = new SmartTelePhone();
        tele1.disconnect();
        tele1.call(8700120406l);
        TelePhone tele2 = new SmartTelePhone();
        // tele2.call(); --> gives error
        tele2.ring(8700120406l);

        monkey mon1 = new human1();
        // mon1.sleep(); --> Gives error
        // mon1.eat(); --> gives error
        mon1.jump();
        mon1.bite();
        BasicAnimal mon2 = new human1();
        // mon2.bite(); --> gives error
        // mon1.jump(); --> gives error
        mon2.eat();
        mon2.sleep();
        human1 mon3 = new human1();
        mon1.jump();
        mon1.bite();
        mon2.eat();
        mon2.sleep();

        TV lg = new TV();
        lg.OTT();
        lg.YouTube();
        lg.search();
        lg.select();
        lg.voiceCommand();
        lg.volumeDec();
        lg.volumeInc();

    }
}
