public class lab20{
    public static void main(String args[]){
    
        int num=12;
        int den[]={12,0,3,0,0,4};
        
    for(int i=0;i<10;i++){
        try{
            System.out.println("ans="+num/den[i]);
        }
    
        catch(ArithmeticException e){
            System.out.println("除數為0");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("陣列索引值超出範圍");
            break;
        }
    }

    }
}