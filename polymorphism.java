interface electricalAppliances{
    void light();
    void fan();
}
interface devices{
    void tablet();
    void laptop();
}
interface woodenWork{
    void door();
    void window();
}
class house implements electricalAppliances,woodenWork,devices{
    public void light(){
        System.out.println("Turning On light");
    }
    public void fan(){
        System.out.println("Turning ON fan");
    }
    public void tablet(){
        System.out.println("Switching On tablet");
    }
    public void laptop(){
        System.out.println("Powering On laptop");
    }
    public void door(){
        System.out.println("Opening Door");
    }
    public void window(){
        System.out.println("Opening window");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        devices dev = new house(); // This restricts user to Devices and he cannot use any other types of function i.e. electricalAppliances and woodenWork
        // dev.door(); --> Throws an error
        dev.tablet();
        electricalAppliances EA = new house();// This restricts user to electricalAppliances and he cannot use any other types of function i.e. devices and woodenWork
        EA.light();
        // EA.laptop(); --> Throws an error
    }
}
