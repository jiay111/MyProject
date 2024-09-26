public class DataTypeVariable{
    public static void main(String[] args){
        //在終端機印出各種資料型態
        //整數，預設是int型態
        int x;
        x=3;
        System.out.println(x);
        x=120;
        System.out.println(x);
        //長整數，數字的後面特別加上L(大小寫都可以)
        long y=200000000000L;
        System.out.println(y);
        //浮點數，預設為double型態
        double m=3.14159268;
        System.out.println(m);
        //單精度浮點數，數字的後面特別加上F(精準度到小數點以下7位)
        float n=3.14159268F;
        System.out.println(n);
        //布林值
        boolean b;
        b= true;
        System.out.println(b);
        //字元(只能單一文字，並使用單引號))
        char c='我';
        System.out.println(c);
        //字串，可以包含0到多個字元
        String s="哈摟";
        System.out.println(s);
        s = "hello!";
        System.out.println(s);
    }
}