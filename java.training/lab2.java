import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入成績: ");
        int num = scn.nextInt();

        if (num < 0 || num > 100) {
            System.out.println("成績輸入錯誤");
        } else if (num >= 50 && num <= 59) {
            System.out.println("須要補考");
        } else if (num >= 0 && num < 50) {
            System.out.println("不及格");
        } else {
            System.out.println("及格");
        }

        scn.close();
    }
}