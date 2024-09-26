class Rectangle{
    private int length;
    private int width;
    private int area;

    public Rectangle(){
        length = 2;
        width = 2;
    }

    public Rectangle(int len, int wid){
        length = len;
        width = wid;
    }

    public void area(){
        area = length * width;
        System.out.print("length="+length);
        System.out.print(", width="+width);
        System.out.println(", area="+area);
    }

}

class Data extends Rectangle{
 
    public Data(){
        
    }
    public Data(int len, int wid){
        super(len,wid);
    }
}
public class lab14 {
    
    public static void main(String[] args) {
        Data obj1=new Data(3,8);
        Data obj2=new Data();
        obj1.area();
        obj2.area();
    }
}
