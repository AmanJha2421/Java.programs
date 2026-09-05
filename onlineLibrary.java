import java.util.Scanner;
class library{
    Scanner sc = new Scanner(System.in);
    int bookNum;
    int n;
    String avlBooks[] = new String[20];
    {
        avlBooks[0] = "Book 0";
        avlBooks[1] = "Book 1";
        avlBooks[2] = "Book 2";
        avlBooks[3] = "Book 3";
        avlBooks[4] = "Book 4";
        avlBooks[5] = "Book 5";
        avlBooks[6] = "Book 6";
        avlBooks[7] = "Book 7";
        avlBooks[8] = "Book 8";
        avlBooks[9] = "Book 9";
    }
    String issuedBook[] = new String[20];
    public void addBook(){
        System.out.println("Enter number of books you want to add : ");
        n = sc.nextInt();
        System.out.println("Enter book number to add");
        for(int i=0;i<n;i++){
        bookNum = sc.nextInt();
        avlBooks[bookNum] = "book "+bookNum;
        System.out.println("Added book : "+avlBooks[bookNum]);
        }
    }
    public void showAvlBooks(){
        System.out.println("Available books are :");
        for(String e : avlBooks){
            if(e!=null){
                System.out.println(e);
            }
        }
    }
    public void issueBook(){
        System.out.println("Enter total number of books you want to issue");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter book number to issue : ");
        bookNum = sc.nextInt();
        issuedBook[bookNum] = "book "+bookNum;
        avlBooks[bookNum] = null;
        }
    }
    public void issuedBook(){
        System.out.println("Issued book are : ");
        for(int i=0;i<issuedBook.length;i++){
            if(issuedBook[i]!=null){
                System.out.println(issuedBook[i]);
            }   
        }
    }
    public void returnBook(){
        System.out.println("Enter total number of books you want to return");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter book number to Return : ");
        bookNum = sc.nextInt();
        issuedBook[bookNum] = null;
        avlBooks[bookNum] = "book "+bookNum;
        }
    }
}

public class onlineLibrary {
    public static void main(String[] args) {
        library lib = new library();
        lib.showAvlBooks();
        lib.addBook();
        lib.showAvlBooks();
        lib.issueBook();
        lib.issuedBook();
        lib.showAvlBooks();
        lib.returnBook();
        lib.issuedBook();
        lib.showAvlBooks();
    }
    
}
