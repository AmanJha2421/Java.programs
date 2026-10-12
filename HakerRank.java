import java.util.Scanner;
public class HakerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = sc.nextLine();
        arr[1] = sc.nextLine();
        int arr1 = arr[0].length();
        int arr2 = arr[1].length();
        System.out.println(arr1+arr2);
        int small = Math.min(arr1,arr2);
        for(int i=0;i<small;i++){
            int a = arr[0].charAt(i);
            int b = arr[1].charAt(i);
            if(a>b){
                System.out.println("Yes");
                break;
            }
            else if(b>a){
                System.out.println("No");
                break;
            }
            else if(a==b){
                if(i==(small-1)){
                    System.out.println("No");
                    break;
                }
                continue;
            }
        }
        String a = arr[0].substring(0,1);
        String b = arr[1].substring(0,1);
        System.out.println(arr[0].replaceFirst(a,a.toUpperCase())+" "+arr[1].replaceFirst(b,b.toUpperCase()));
    }
}
