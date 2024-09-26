// 多重繼承的練習
interface Data{
    //abstract隱藏省略
    public void showData();
}

interface Test{
    public void showScore();
    public double calcu();
}

class CStu implements Data,Test{
    protected String id; // 學號
    protected String name; // 姓名
    protected int mid; // 期中考成績
    protected int finl; // 期末考成績
    protected int common; // 平時成績
    //請完成這個部份
    public CStu(String s1, String s2, int n1, int n2, int n3){
        id  = s1;
        name = s2;
        mid = n1;
        finl = n2;
        common = n3;
    } 



    public void show(){
        //請完成這個部份
        showData();
        showScore();
    }

    public void showScore(){
        //請完成這個部份
        System.out.println("期中考成績:" + mid);
        System.out.println("期末考成績" + finl);
        System.out.println("平時成績" + common);
        System.out.println("學期成績" + calcu());
    }

    public void showData(){
        //請完成這個部份
        System.out.println("學號:"+id);
        System.out.println("姓名:"+name);
    }

    public double calcu(){
        //請完成這個部份
        return ((mid+finl+common)/3);
    }
}

public class lab18{
    public static void main(String args[]){
        CStu stu=new CStu("940001","Fiona",90,92,85);
        stu.show();
    }
}

