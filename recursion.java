public class recursion {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int fibonacci(int n){
        int base  = 0;
        int base1 = 1;
       
        if(n==0){
            return base;
        }
        else if(n==1){
            return base1;
            
        }
        else {
            int c = fibonacci(n-1) + fibonacci(n-2);
            return c;
        }

    }
    public static void main(String[] args) {
        // int f = factorial(5);
        // System.out.println(f);
        int n = 5;
        do{
        System.out.println(fibonacci(n));
            n--;
        }while(n>=0);

    }
    
}
