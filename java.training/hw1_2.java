import java.util.Scanner;

public class hw1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入原始矩陣的行數=>");
        int col = scn.nextInt();
        System.out.print("請輸入原始矩陣的列數=>");
        int row = scn.nextInt();

        int[][] a= new int[row][col];
        int[][] b = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                System.out.printf("A[%d][%d]元素值=>",i,j);
                int num = scn.nextInt();
                a[i][j] = num;
                b[j][i] = num;
            } 
        }

        System.out.println("原始矩陣:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("轉置矩陣:");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        scn.close();
    }
}
