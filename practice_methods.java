public class practice_methods {
     static void table(int n){
        for(int i=1;i<=10;i++){
            int e = i*n;
            System.out.printf("%d x %d = %d\n",n,i,e);
        }
    }
    static void star(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void stars(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        int sum;
        if(n==1){
            return 1;
        }
        else{
             sum = n + sum(n-1);
             return sum;
        }
    }
    static int fib(int n){
        int base = 0;
        int base1 = 1;
        if(n==0){
            return base;
        }
        else if(n==1){
            return base1;
        }
        else{
            int c = fib(n-1) + fib(n-2);
            return c;
        }
    }
    static int avg(int ...arr){
        int sum = 0;
        for(int e:arr){
            sum= sum + e;
        }
        int l = arr.length;
        int avg = sum/l;
        return avg;
    }
    static void star1(int n){
        if(n>0){
            star1(n-1);
            for(int i=n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        }
         static void stars1(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            stars1(n-1);
        }
        
        }
        static float c_f(float c){
            float f = ((c * 9/5) + 32.0f);
            return f;
        }
    public static void main(String[] args) {
        // To write multiplication table using methods
        table(19);
        // To print star pyramid using functions
        star(10);
        // To find sum of n natural natural number using recurtion
        int a =sum(10);
        System.out.println(a);
        // To print reverse star pyramid using functions
        stars(5);
        // To get fibonacci numbex of any index
        int b = fib(12);
        System.out.println(b);
        // To find avg of set of numbers taken as arguement
        int c = avg(10,20,30,40,50);
        System.out.println(c);
        // printing starts using recursion
        star1(5);
        // To print reverse star pyramid using recursion
        stars1(5);
        // Celcius to fahrenheit
        float d = c_f(39.666666667f);
        System.out.println(d);
    }
}
