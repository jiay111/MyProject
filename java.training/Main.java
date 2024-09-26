import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入不喜歡的數字:");
        int num = scn.nextInt();

        for (int j = 1; j <= 49; j++) {
            // 跳過含有不喜歡的數字的數字
            if (containsDislikedNumber(j, num)) {
                continue;
            }
            System.out.print(j + " ");
        }
        scn.close();
    }

    // 檢查數字是否包含不喜歡的數字
    public static boolean containsDislikedNumber(int number, int dislikedNumber) {
        if (number % 10 == dislikedNumber || number / 10 == dislikedNumber) {
            return true;
        }
        return false;
    }
}
