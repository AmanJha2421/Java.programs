class drink{
    private int id;
    private String color;
    private String name;
// CREATION OF CONSTRUCTORS
    public drink(){
        id = 101;
        color = "black";
        name = "coke";
    }
    public drink(int Id){
        id = Id;
        color = "black";
        name = "coke";
    }
    //  OVERLOADING OF CONSTRUCTORS
    public drink(String Name){
        id = 101;
        color = "black";
        name = Name;
    }
    public drink(String Name,String Color){
        id = 101;
        color = Color;
        name = Name;
    }
    public drink(String Name,String Color,int Id){
        id = Id;
        color = Color;
        name = Name;
    }
    public void getId(){
        System.out.println("Id : "+id);
    }
    public void getName(){
        System.out.println("Name : " +name);
    }
    public void getColor(){
        System.out.println("Color : "+color);
    }
    
}


public class constructors {
    public static void main(String[] args) {
        drink chilled = new drink("pepsi","red",10);
        chilled.getId();
        chilled.getColor();
        chilled.getName();
    }
    
}
