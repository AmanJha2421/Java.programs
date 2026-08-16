class array
{
    public static void main(String []args)
    {
        // int []num = new int[10];
        // num[0] = 1;
        // num[1] = 2;
        // num[2] = 3;
        // System.out.println(num[0]+"\n"+ num[1]+"\n"+ num[2]);

         int [] num = {36,35,3,123,45,856};
        // for(int i=(num.length - 1);i>=0 ;i--){
        //     System.out.println(num[i]);
        // }

        // using for-each loop
        for(int element : num){
            System.out.println(element);
        }
        // MULTIDIMENTIONAL ARRAY
        int flats[][] = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }


    }
}