class testing{
    int a;
    public void setA(int x){
        System.out.println("Setting value of A");
        a=x;
    }
    public int getA(){
        return a;
    }
}

class executing extends testing{
    int b;
    public void setB(int y){
        System.out.println("Setting value of B");
        b=y;
    }
    public int getB(){
        return b;
    }

}




public class inheritance {
    public static void main(String[] args) {
        
        testing program = new testing();
        program.setA(21);
        System.out.println(program.getA());
    //   Use of derived class to call functions of base class
        executing program1 = new executing();
        program1.setA(24);
        System.out.println(program1.getA());
        program1.setB(10);
        System.out.println(program1.getB());
        
        

    }
}
