import java.util.Scanner;

public class lab7 {

    public static int addto(int n) {
        StringBuilder equation = new StringBuilder();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
            if (i != 1) {
                equation.append("+");
            }
            equation.append(i);
        }
        System.out.println("Input=" + n + " , " + equation + "=" + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 n 的值：");
        int n = scanner.nextInt();
        addto(n);
        scanner.close();
    }
}
