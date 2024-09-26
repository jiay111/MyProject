import java.util.Scanner;
public class lab1{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個長度為3個字元的字串: ");
        String str=scn.next(); //
        
        char ch1=str.charAt(0);
        int num1 =pos(ch1);
        System.out.println("第一個字母為"+ch1+","+ch1+"英文中第"+num1+"個字母");
        
        
        char ch2=str.charAt(1);
        int num2 =pos(ch2);
        System.out.println("第二個字母為"+ch2+","+ch2+"英文中第"+num2+"個字母");


        char ch3=str.charAt(2);
        int num3 =pos(ch3);
        System.out.println("第三個字母為"+ch3+","+ch3+"英文中第"+num3+"個字母");

        scn.close();
    }

    private static int pos(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return ch - 'A' + 1;
        }
        else if(ch >= 'a' && ch<= 'z'){
            return ch - 'a' + 1;
        } 
        else{
            return -1;
        }
    }
}
    