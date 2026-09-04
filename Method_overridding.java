class one{
    public void meth1(){
        System.out.println("Method 1 of class one");

    }
    public void meth2(int a){
        System.out.println("Method 2 of class one with arguement : "+a);
    }
    public void meth2(){
        System.out.println("Method 2 of class one");
    }
}
class two extends one{
    @Override // this keyword tells if a method is really being override or not!
    public void meth1(){
        System.out.println("Method 1 of class two");
    }
    @Override
    public void meth2(int b){
        System.out.println("Mehtod 2 of class two with arguement : "+b);
    }
}

public class Method_overridding {
    public static void main(String[] args) {
        
        one a = new one();
        a.meth1();


        two b = new two();
        b.meth1();
        b.meth2();
        b.meth2(5);

    }
    
}
