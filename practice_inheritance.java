class circle1{
    double r,volume;
    double area;
    circle1(){
        System.out.println("Circle with no para");
        r = 7;
    }
    circle1(int rad){
        System.out.println("Circle with para");
        r = rad;
    }
    public double Area(){
        area = Math.PI*this.r*this.r;
        return area;
    }
}
class cylinder1 extends circle1{
    int height;
    cylinder1(){
        System.out.println("cylinder without para");
        height = 10;
    }
    cylinder1(int h,int r){
        super(r);
        height = h;
        System.out.println("Cylinder wiht para");
    }
    double vol(){
        volume = Math.PI*r*r*height;
        return volume;
    }
}


class rect{
    int length,breadth;
    rect(){
        length = 10;
        breadth = 20;
    }
    int area(){
        int area = length*breadth;
        return area;
    }
}
class cuboid extends rect{
    int height;
    cuboid(){
        height = 15;
    }
    cuboid(int h){
        height = h;
    }
    int volume(){
        int vol = length*breadth*height;
        return vol;
    }
}
public class practice_inheritance {
    public static void main(String[] args) {
        cylinder1 cy = new cylinder1();
        System.out.println(cy.vol());
        // circle1 ci = new circle1();
        // cuboid cb = new cuboid(20);
        // System.out.println(cb.volume());
        
    }
}
