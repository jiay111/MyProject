interface Data{
    public void best(); // 判斷那一科成績較高
    public void failed(); // 判斷那一科成績低於60分
}

interface Test extends Data{
    public void showData(); // 顯示學生的資料及平均成績
    public double average(); // 計算數學和英文的平均成績
}

class CStu implements Test{
    protected String name; // 姓名
    protected int math; // 數學成績
    protected int english; // 英文成績

    public CStu(String s1, int n1, int n2){
        name  = s1;
        math = n1;
        english = n2;
    } 

// 請完成這個部份的程式碼
    public void show(){
        //請完成這個部份
        showData();
        //average();
        best();
        failed();
    }

    public void showData(){
        //請完成這個部份
        System.out.println("姓名" + name);
        System.out.println("數學成績:" + math);
        System.out.println("英文成績:" + english);
        System.out.println("平均成績"+average());
    }
    public void best(){ 
        if(math>english) 
            System.out.println(name+"的數學比英文好"); 
        else if(math<english) 
            System.out.println(name+"的英文比數學好"); 
        else 
            System.out.println(name+"的數學和英文一樣好"); 
    } 

    public void failed(){ 
        if(math<60) 
            System.out.println(name+"的數學當掉了"); 
        if(english<60) 
            System.out.println(name+"的英文當掉了"); 
        if(math>=60 && english>=60) 
            System.out.println(name+"的數學和英文都及格"); 
    } 
    

    public double average(){
        //請完成這個部份
        return ((math+english)/2.0);
    }
    
}

public class lab19{
    public static void main(String args[]){
        CStu stu=new CStu("Judy",58,91);
        stu.show();
    }
}