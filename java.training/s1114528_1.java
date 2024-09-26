import java.util.Scanner;

public class s1114528_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入一個整數:");
        int n = scn.nextInt();
        int size = 2 * n - 1;

        for(int i = 0; i<size; i++){
            for(int j=0; j<size; j++){
                int num= Math.max(Math.abs(n-i-1),Math.abs(n-j-1))+1;

                if(num%2!=0){
                    System.out.print(num);
                }
                else{
                    if(Math.abs(n-i-1)==Math.abs(n-j-1)){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("*");
                    }
                }
               
            }
            System.out.println();
        }

    scn.close();
    }
}







