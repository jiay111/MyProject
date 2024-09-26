class Cwin {
    private static int cnt = 0; 
    private String color;
    private int width;
    private int height;

    public void count(){
        cnt++;
    }

    public Cwin(String str, int w, int h) {
        this.color = str;
        this.width = w;
        this.height = h;
        cnt++;
    }

    public Cwin(){
        this.color = "red";
        this.width = 2;
        this.height = 2;
        cnt++;
    }

    // setZero 函數，將 cnt 設為 0
    public void setZero() {
        cnt = 0;
    }

    // setValue 函數，將 cnt 設為 n
    public void setValue(int n) {
        cnt = n;
    }

    public static int getCnt() {
        return cnt;
    }
}

public class lab12{
    
    public static void main(String[] args) {
        Cwin obj1 = new Cwin(); 
        Cwin obj2 = new Cwin(); 
        System.out.println("cnt: " + Cwin.getCnt()); 
        
        obj1.setZero(); 
        System.out.println("cnt: " + Cwin.getCnt());
        
        obj2.setValue(2); 
        System.out.println("cnt: " + Cwin.getCnt()); 
        
        Cwin obj3 = new Cwin(); 
        System.out.println("cnt: " + Cwin.getCnt()); 
    }
}



/*
(a) 設計類別 Cwin, 內含cnt變數 (初值設為0) 與 count 函數, 只要每建立一個物件, cnt 的值加一.
(b) 設計一個建構元 Cwin(String str, int w, int h), 當此建構元呼叫時, 會自動設定 color=str, width=w, height=h
(c) 設計一個沒有引數的建構元 Cwin(), 當此建構元呼叫時, 會自動設定 color="Red", width=2, height=2
(d) 設計一個 setZero 函數, 當此函數被呼叫時, cnt 值會被設為 0.
(e) 設計一個 setValue(int n) 函數, 當此函數被呼叫時, cnt 值會被設為 n.

主程式:
obj1
obj2
print cnt (2)
setZero
print cnt (0)
setValue 2
print cnt (2)
obj3
print cnt (3)
 */