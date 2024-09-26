import java.util.Scanner;

public class s1114528__1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入矩陣大小:");
        int a = scn.nextInt();
         
        String[][] num = new String[a][a];
        String[][] tra = new String[a][a];
        

         for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                String s = scn.next();
                num[i][j] = s;
            }
         }

         System.out.println();

        for(int n=0; n<a; n++){
            for(int m=0; m<a; m++){
                tra[n][m]=num[m][n];
                System.out.print(tra[n][m]);
            }
            System.out.println();
        }
        scn.close();
    }
}


/*
 
 */