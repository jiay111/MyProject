class CCalculator{
    private int a,b,c,d;

    public void set_value(int w, int x, int y, int z){
        a = w;
        b = x;
        c = y;
        d = z;
    }

    public void show(){
        System.out.println("a="+a+"  b="+b+"  c="+c+"  d="+d);
    }

    private int sum(){
        int sum = 0;
        for(int i=1; i<=a; ++i){
            sum += i;
        }
        return sum;
    }

    public int add(){
        return sum();
    }

    public int sub(){
        return b-sum();
    }

    private double mul1(){
        double mul =1;
        for(double i=1; i<=c; i++){
            mul *= i;
        }
        return mul;
    }

    public double mul(){
        return mul1();
    }
    
    public double avg(){
        return mul1()/d; 

    }
}

public class lab10 {
    public static void main(String[] args) {
        CCalculator c1 = new CCalculator();
        c1.set_value(5,30,17,10);
        c1.show();
        System.out.println("add:"+ c1.add());
        System.out.println("sum:"+ c1.sub());
        System.out.println("mul:"+c1.mul());
        System.out.println("avg:"+c1.avg()); 
    }
}
/*
 設計一個 CCalculator 類別, 資料成員有 a,b,c,d 型態為 int, 請建立該類別物件並完成以下功能:
(a) 定義 set_value(int w, int x, int y, int z)函數, 用來設定資料成員的值 a=5, b=30, c=17, d=10.
(b) 定義 show(), 用來列印所有資料成員的值
(c) 定義 add(), 用來傳回 1+2+...+a
(d) 定義 sub(), 用來傳回 b-(1+2+...+a)
(e) 定義 mul(), 用來傳回 c!
(f) 定義 avg(), 用來傳回 c!/d , 傳回型態為 double.
 */