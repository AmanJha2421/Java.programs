import java.util.Scanner;
public class HackerRank {

// static String large(int n,String st){
    // int temp = st.charAt(0);
    // int index = 0;
    // for(int i=0;i<st.length()-n+1;i++){
    //     if(st.charAt(i)>temp){
    //         temp = st.charAt(i);
    //         index = i;
    //     }
    //     else if(st.charAt(i)==temp){
    //         for(int j=i;j<i+n-1;j++){ 
    //             if(st.charAt(j+1)>st.charAt(index+j-i+1)){
    //                 temp = st.charAt(i);
    //                 index = i;
    //             }
    //         }
    //     }
    // }
    // return st.substring(index,index+n);

static String getSmallestAndLargest(String st,int n){
    int temp = st.charAt(0);
    int index = 0;
    for(int i=0;i<st.length()-n+1;i++){
        if(st.charAt(i)<temp){
            temp = st.charAt(i);
            index = i;
        }
        else if(st.charAt(i)==temp){
            for(int j=i;j<i+n-1;j++){ 
                if(st.charAt(j+1)<st.charAt(index+j-i+1)){
                    temp = st.charAt(i);
                    index = i;
                }
            }
        }
    }
    // return st.substring(index,index+n);
    int temp1 = st.charAt(0);
    int index1 = 0;
    for(int i=0;i<st.length()-n+1;i++){
        if(st.charAt(i)>temp1){
            temp1 = st.charAt(i);
            index1 = i;
        }
        else if(st.charAt(i)==temp1){
            for(int j=i;j<i+n-1;j++){ 
                if(st.charAt(j+1)>st.charAt(index1+j-i+1)){
                    temp1 = st.charAt(i);
                    index1 = i;
                }
            }
        }
    }
    return st.substring(index,index+n)+"\n"+st.substring(index1,index1+n);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] arr = new String[2];
        // arr[0] = sc.nextLine();
        // arr[1] = sc.nextLine();
        // int arr1 = arr[0].length();
        // int arr2 = arr[1].length();
        // System.out.println(arr1+arr2);
        // int small = Math.min(arr1,arr2);
        // for(int i=0;i<small;i++){
        //     int a = arr[0].charAt(i);
        //     int b = arr[1].charAt(i);
        //     if(a>b){
        //         System.out.println("Yes");
        //         break;
        //     }
        //     else if(b>a){
        //         System.out.println("No");
        //         break;
        //     }
        //     else if(a==b){
        //         if(i==(small-1)){
        //             System.out.println("No");
        //             break;
        //         }
        //         continue;
        //     }
        // }
        // String a = arr[0].substring(0,1);
        // String b = arr[1].substring(0,1);
        // System.out.println(arr[0].replaceFirst(a,a.toUpperCase())+" "+arr[1].replaceFirst(b,b.toUpperCase()));


        // String st = sc.next();
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // System.out.println(st.substring(start,end));
        int n = sc.nextInt();
        String st = sc.next();
        System.out.println(getSmallestAndLargest(st, n));
    }
}
