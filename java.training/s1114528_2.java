import java.util.Scanner;
public class s1114528_2 {
    public static void main(String[] args) {
            
            Scanner scn = new Scanner(System.in);
            System.out.print("起始方向:");
            //int w = scn.nextInt();
            System.out.print("陣列大小:");
            int n = scn.nextInt();
            int s=n/2;

            int[][] num = new int[n][n];

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int m = scn.nextInt();
                    num[i][j] = m;
                } 
                  
            }
            System.out.print(num[s][s]);
            
            //for(int i=0;i<n; i++){
              //  for(int j=0;j<n; j++){
                //    System.out.print(num[i][j] + " ");
                //}
                //System.out.println();

            //}

            


        
        scn.close();
        }
}
    