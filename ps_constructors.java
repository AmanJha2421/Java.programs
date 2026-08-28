import java.util.Scanner;
class rec{
    private int l,b;
    public rec(){
        l = 4;
        b = 5;
    }
    public rec(int length,int breadth){
        l = length;
        b = breadth;
    }
    public int getLength(){
        return l;
    }
    public int getBreadth(){
        return b;
    }
}
 class cylinder{
    int r,h;
    float pi = 3.14f;
    public cylinder(int radius,int height){
        float sa = 2.0f*pi*radius*(height+radius);
        float volume = pi*radius*radius*height;
        System.out.println(sa);
        System.out.println(volume);
    }
    
    public void setRadius(int a){
    r = a;
    }
    public void setHeight(int b){
    h = b;
    }
    public int getRadius(){
    return r;
    }
    public int getHeight(){
    return h;
    }
    public float SA(){
        float sa = 2.0f*pi*r*(h+r);
        return sa;
    }
    public float volume(){
        float volume = pi*r*r*h;
        return volume;
    }

}

public class ps_constructors {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        cylinder a1 = new cylinder(7,10);
        rec r1 = new rec(50,50);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        

        System.out.print("Set height : ");
        a1.setHeight(sc.nextInt());
        System.out.print("Set radius : ");
        a1.setRadius(sc.nextInt());
        System.out.println(a1.SA());
        System.out.println(a1.volume());
        
    }
    
}
