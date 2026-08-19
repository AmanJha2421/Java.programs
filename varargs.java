public class varargs {
    // IF WE USE "..." IT INDICATES THAT THE ARGUMENTS I'M GIVING SHALL BE PACKED IN A ARRAY 
    // IT AVOIDS TO THE USE OF METHOD OVERLOADING AGAIN AND AGAIN 
    static void vararg(int ...aman){
        for(int a:aman){
            System.out.print(a+"\t");
        }
    }
    static void names(String ...ashu){
        for( String e : ashu){
            System.out.print("\n"+e+"\t");
        }
    }
   
    
    public static void main(String[] args) {
        vararg(67,68,69,70);
        names("Aman","Ashu","Aachal","Anjali");
    }
}
