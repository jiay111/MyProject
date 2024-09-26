import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int size = scn.nextInt();
        int num = 2 * size - 1;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                int n = Math.max(Math.abs(size-i-1),Math.abs(size-j-1))+1;
                System.out.print(n);
            }
            System.out.println();
        }
        scn.close();
    }
}
