public class lab8 {
    public static void main(String[] args) {
        star(5);
        star(5,7);
        star(1,3,5);

    }

    public static void star(int n) {
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void star(int n, int m) {
        int max=n;
        if(m>n){
            max=m;
        }
        System.out.println(max);
    }

    public static void star(int n, int m, int k) {
        int num = n*m*k;
        System.out.println(num);
        
    }
}
