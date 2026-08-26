class drinks{
    private int id;
    private String name;
    public void setDrinkId(int n){
        id = n;
    }
    public void setDrinkName(String Name){
        name = Name;
    }
    public int getDrinkId(){
        return id;
    }
    public String getDrinkName(){
        return name;
    }
}
public class getter_setter {
    public static void main(String[] args) {
        drinks coke = new drinks();
        drinks pepsi = new drinks();
        coke.setDrinkId(101);
        System.out.println(coke.getDrinkId()); 
        coke.setDrinkName("Diet Coke");
        System.out.println(coke.getDrinkName());
        pepsi.setDrinkId(505);
        System.out.println(pepsi.getDrinkId()); 
        pepsi.setDrinkName("Pepsi");
        System.out.println(pepsi.getDrinkName()); 
    }
}
