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
        
        
    }
}
