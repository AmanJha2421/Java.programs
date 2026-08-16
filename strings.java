import java.util.Scanner;
class strings
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // String name = new String("aman");
        // System.out.print(name);
        // String name = "aman";
        // System.out.println(name);

        //  diff ways to print
        // int a = 5;
        // char b = 'A';
        // System.out.printf("%d and %c ",a,b);
        // System.out.format("%d and %c ",a,b);

        // Usee input using string
        // String str = sc.nextLine();
        // String st = sc.nextLine();
        // System.out.println(str + st);


        // STRING METHODS
        String str = "Aman jha";
        System.out.println(str.trim());
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));
        System.out.println(str.replace('a','b'));
        System.out.println(str.indexOf('m'));
        System.out.println(str.indexOf('a'));
        String st = "Hello, \n this is \t \" Aman \"";
        System.out.println(st);
    }
}