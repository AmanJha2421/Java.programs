public class METHOD_OVERLOADING {
    // HERE METHOD NAMED METHOD IS OVER LOADED BY ADDDING MORE PARAMETERS
    static void method(){
        System.out.println("Method 1 without parameter");
    }
    static void method(int a){
        System.out.printf("Method with one parameter i.e %d \n", a);
    }
    static void method(int  a,int b){
        System.out.printf("Method with two parameter i.e %d and %d ",a,b);
    }
    public static void main(String[] args) {
        method();
        method(5);
        method(6,7);
    }
}
