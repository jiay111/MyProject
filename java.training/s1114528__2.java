import java.util.Scanner;
public class s1114528__2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        int[] s = new int[n];
        int sum =0;

        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                int num =scn.nextInt();
                arr[i][j] = num;
            }
        }

        for(int a=0; a<n; a++){
            int max = arr[a][0];

            for(int b=0; b<m; b++){

                if(arr[a][b]>max){
                    max = arr[a][b];
                }
            }

            s[a] = max;
            sum += max;

        }
       
        System.out.println(sum);

        for(int i=0; i<n; i++){

            if(sum % s[i]==0){
                System.out.print(s[i]+" ");
            }
        
        }  
        scn.close();
    }
}
