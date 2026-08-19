class methods{
     int sum(int a,int b){
        int c = a+b;
        return c;
    }
    int sub(int a,int b){
        int c = a-b;
        return c;
    }
    static void array(int [] arr){
        arr[0] = 50;
    }
    static void okk(){
        System.out.println("hello");
    }
    public static void main(String []args){
        // int a,b;
        // a=10;
        // b=5;
        // methods obj = new methods();
        // int c = obj.sum(a,b);
        // int d = obj.sub(a,b);
        // System.out.println(c);
        // System.out.println(d);

        // HERE WE CAN SEE THE VALUE OF ARRAY IS CHANGED AS WE ARE TRANFERRING THE REFERENCE AND NOT COPYING THE VALUE OF INTEGER 
        int [] marks = {35,55,456,34,52};
        array(marks);
        System.out.println(marks[0]);
        okk();
    }
}