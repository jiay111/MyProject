import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("input= ");
        int num = scn.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d",j);
            }
        System.out.println(); //換行
        }

        for(int i=num-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.printf("%d",j);
            }
            System.out.println(); //換行
        }
        scn.close();
    }
}