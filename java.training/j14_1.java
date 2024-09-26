




























/*import java.util.Scanner;

public class j14_1 {
    static final int LEFT = 0;
    static final int UP = 1;
    static final int RIGHT = 2;
    static final int DOWN = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        int N = Integer.parseInt(scanner.nextLine());

        // Input starting direction
        int nStartDir = Integer.parseInt(scanner.nextLine());

        // Input array data
        int[][] data = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                data[i][j] = Integer.parseInt(line[j]);
            }
        }

        // Generate step array
        int nStepArrayNum = (N - 1) * 2 + 1;
        int[] nStepArray = new int[nStepArrayNum];
        int k = 1;
        for (int i = 0; i < nStepArrayNum - 1; i += 2) {
            nStepArray[i] = k;
            nStepArray[i + 1] = k;
            k++;
        }
        nStepArray[nStepArrayNum - 1] = N - 1;

        // Generate arrow direction array
        int nDir = nStartDir;
        int[] nArrowArray = new int[N * N - 1];
        int p = 0;
        while (p < N * N - 1) {
            for (int j = 0; j < nStepArrayNum; j++) {
                for (int l = 0; l < nStepArray[j]; l++) {
                    nArrowArray[p] = nDir;
                    p++;
                }
                nDir = getNextDirection(nDir);
            }
        }

        // Calculate row and column indices
        int[] nRow = new int[N * N];
        int[] nCol = new int[N * N];
        nRow[0] = N / 2;
        nCol[0] = N / 2;
        for (int i = 1; i < N * N; i++) {
            nRow[i] = nRow[i - 1] + getRowDelta(nArrowArray[i - 1]);
        }
        for (int i = 1; i < N * N; i++) {
            nCol[i] = nCol[i - 1] + getColDelta(nArrowArray[i - 1]);
        }

        // Print the result
        for (int i = 0; i < N * N; i++) {
            System.out.print(data[nRow[i]][nCol[i]]);
        }
        System.out.println();

        scanner.close();
    }

    // Get the next direction in clockwise order
    static int getNextDirection(int nDir) {
        if (nDir == DOWN)
            return LEFT;
        return nDir + 1;
    }

    // Get the row delta when direction changes
    static int getRowDelta(int nDir) {
        if (nDir == RIGHT)
            return 0;
        else if (nDir == DOWN)
            return 1;
        else if (nDir == LEFT)
            return 0;
        else if (nDir == UP)
            return -1;
        return 0;
    }

    // Get the column delta when direction changes
    static int getColDelta(int nDir) {
        if (nDir == RIGHT)
            return 1;
        else if (nDir == DOWN)
            return 0;
        else if (nDir == LEFT)
            return -1;
        else if (nDir == UP)
            return 0;
        return 0;
    }
}
*/
