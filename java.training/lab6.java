public class lab6 {
    public static void main(String[] args) {
        // 成績表
        int[][] scores = {
            {83, 90, 76, 83, 89},
            {68, 88, 92, 60, 76},
            {79, 93, 67, 91, 78}
        };

        // 計算每位同學的平均成績
        double[] studentAverages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            studentAverages[i] = (double) sum / scores[i].length;
            System.out.println("同學" + (i + 1) + "的平均分：" + studentAverages[i]);
        }

         // 計算每日平均成績
         double[] dailyAverages = new double[scores[0].length];
         for (int j = 0; j < scores[0].length; j++) {
             int sum = 0;
             for (int i = 0; i < scores.length; i++) {
                 sum += scores[i][j];
             }
             dailyAverages[j] = (double) sum / scores.length;
             System.out.println("星期" + convertToDay(j) + "的平均分：" + dailyAverages[j]);
         }

        // 找出第一名同學
        int topStudentIndex = findMaxIndex(studentAverages);
        // 找出最後一名同學
        int bottomStudentIndex = findMinIndex(studentAverages);

        // 找出全部成績中最高的日子與同學
        int highestScoreIndex = findMaxIndex(scores);
        int highestScoreStudent = highestScoreIndex / scores[0].length;
        int highestScoreDay = highestScoreIndex % scores[0].length;

        // 找出全部成績中最低的日子與同學
        int lowestScoreIndex = findMinIndex(scores);
        int lowestScoreStudent = lowestScoreIndex / scores[0].length;
        int lowestScoreDay = lowestScoreIndex % scores[0].length;

        // 輸出結果
        System.out.println("第一名的同學為：同學" + (topStudentIndex + 1));
        System.out.println("最後一名同學為：同學" + (bottomStudentIndex + 1));
        System.out.println("全部成績中最高的日子與同學為：星期" + convertToDay(highestScoreDay) + "，同學" + (highestScoreStudent + 1));
        System.out.println("全部成績中最低的日子與同學為：星期" + convertToDay(lowestScoreDay) + "，同學" + (lowestScoreStudent + 1));
    }

    // 找出陣列中最大值的索引
    public static int findMaxIndex(int[][] arr) {
        int max = arr[0][0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndex = i * arr[i].length + j;
                }
            }
        }
        return maxIndex;
    }

    // 找出陣列中最小值的索引
    public static int findMinIndex(int[][] arr) {
        int min = arr[0][0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minIndex = i * arr[i].length + j;
                }
            }
        }
        return minIndex;
    }

    // 找出陣列中最大值的索引
    public static int findMaxIndex(double[] arr) {
        double max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 找出陣列中最小值的索引
    public static int findMinIndex(double[] arr) {
        double min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // 將索引轉換為星期
    public static String convertToDay(int index) {
        String[] days = {"一", "二", "三", "四", "五"};
        return days[index];
    }

     
}
