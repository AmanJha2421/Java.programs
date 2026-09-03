class base{
    base(){
        System.out.println("I'm a constructor");
    }
    base(int x){
        System.out.println("I'm a constructor with value : "+x);
    }
}
class derived extends base{
    derived(){
        System.out.println("I'm a derived class constructor");
    }
    derived(int x){
        System.out.println("I'm a derived class constructor with value : "+x);
    }
    derived(int x, int y){
        super(x);
        System.out.println("I'm a derived class constructor with value : "+y);
    }
}
class derived2 extends derived{
    derived2(int x, int y, int z){
        super(x,y);
        System.out.println("I'm a derived class constructor with value : "+z);
    }
}



public class constructors_in_inheritance {
    public static void main(String[] args) {
        // base b = new base();
        // derived d = new derived(0,6);
        // derived2 c = new derived2(0,6,7);
        
        
    }
    
}
