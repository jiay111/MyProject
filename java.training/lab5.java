public class lab5 {
    public static void main(String[] args) {
        int arr[]={3,5,0,3,2,4,1,6,8,5,4,3,2,7,2,5,11,12,13,1,7,11};
        int num1 =0;
        int num2 =0;

        for(int i:arr){
            if(i==3 || i==4||i==5||i==6||i==7)
                num1 +=1;
            else if(i==11||i==12) 
                num2 +=1;
        }
        System.out.printf("array內介於3~7之間的元素共有%d個\n",num1);
        System.out.printf("array內介於11~12之間的元素共有%d個",num2);
    }   
}
