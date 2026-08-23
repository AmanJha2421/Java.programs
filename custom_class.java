class Students{
        int date;
        String name;
        String surname;
        public void details(){
            System.out.println("Birth date : " + date);
            System.out.println("Name : "+name);
        }
        public String getSurname(){
            return surname;
        }
    }

public class custom_class {
    public static void main(String[] args) {
        Students aman = new Students();
        Students aachal = new Students();
        Students fatima = new Students();
        aman.date = 21;
        aman.name = "Ashu";
        aman.surname = "Jha";
        aachal.date = 24;
        aachal.name = "Anjali";
        aachal.surname = "Soni";
        fatima.date = 21;
        fatima.name = "Faatu";
        fatima.surname = "Khatoon";
        
        aman.details();
        aachal.details();
        fatima.details();
        String abc = aman.getSurname();
        System.out.println(abc); 
        String def = aachal.getSurname();
        System.out.println(def); 
        String ghi = fatima.getSurname();
        System.out.println(ghi);

    }
}
