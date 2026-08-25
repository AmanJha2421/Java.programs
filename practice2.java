import java.util.Scanner;
class Employee{
    Scanner sc = new Scanner(System.in);
    int salary;
    String name;
    public void details(){
        System.out.println("Name : "+name);
        System.out.printf("Salary : %d$",salary);
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        name = sc.nextLine();
        return name;
    }
}
class cellPhone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }

}
class square{
    Scanner sc = new Scanner(System.in);
    float side, perimeter, area;
    public void perimeter(){
        perimeter = 4.0f*side;
        System.out.printf("Perimeter : %.2f\n", perimeter);
    }
    public void area(){
        area = (side*side);
        System.out.printf("Area : %.2f ", area);
    }
}
class rectangle{
    Scanner sc = new Scanner(System.in);
    float length, breadth,perimeter, area;
    public void perimeter(){
        perimeter = 2*(length+breadth);
        System.out.printf("Perimeter : %.2f\n", perimeter);
    }
    public void area(){
        area = (length*breadth);
        System.out.printf("Area : %.2f ", area);
    }
}
class circle{
    Scanner sc = new Scanner(System.in);
    float radius, perimeter, area;
    float pi = 3.14f;
    public void perimeter(){
        perimeter = 2*pi*radius;
        System.out.printf("Perimeter : %.2f\n", perimeter);
    }
    public void area(){
        area = (pi*radius*radius);
        System.out.printf("Area : %.2f ", area);
    }
}
class rockStarGames{
    public void run(){
        System.out.println("Running...");
    }
    public void hit(){
        System.out.println("Hitting...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee aman  = new Employee();
        aman.name = "aman";
        aman.salary = 5000;
        aman.details();
        System.out.println(aman.getSalary());
        System.out.println(aman.getName());
        aman.setName();
        aman.details();

        cellPhone redmi = new cellPhone();
        redmi.ringing();
        redmi.vibrating();

        square a = new square();
        System.out.print("Enter length of side of square : ");
        a.side = sc.nextFloat();
        a.perimeter();
        a.area();

        rectangle b = new rectangle();
        System.out.print("Enter length of rectangle : ");
        b.length = sc.nextFloat();
        System.out.print("Enter breadth of rectangle : ");
        b.breadth = sc.nextFloat();
        b.perimeter();
        b.area();

        rockStarGames rg = new rockStarGames();
        rg.fire();
        rg.hit();
        rg.run();

        circle c = new circle();
        System.out.print("Enter radius of circle : ");
        c.radius = sc.nextFloat();
        c.perimeter();
        c.area();
        

        


    }
    
}
