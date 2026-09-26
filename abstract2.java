abstract class abtract{
    public abtract(){
        System.out.println("Constructor");
    }
    abstract void meth();
    abstract void meth2();
}
class abtract2 extends abtract{
    public abtract2(){
        System.out.println("Abtract2 constructor");
    }
    void meth(){
        System.out.println("Abstract2 meth1");
    }
    void meth2(){
        System.out.println("Abstract2 meth2");
    }
}
class abtract3 extends abtract{
    public abtract3(){
        System.out.println("Abtract3 constructor");
    }
    void meth(){
        System.out.println("Abstract3 meth1");
    }
    void meth2(){
        System.out.println("Abstract3 meth2");
    }
}


public class abstract2 {
    public static void main(String[] args) {
        abtract2 ab = new abtract2();
        ab.meth();
        ab.meth2();
        abtract3 abt = new abtract3();
        abt.meth();
        abt.meth2();
        
    }
}
