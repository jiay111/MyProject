class CCircle{
        double pi=3.14;
        double radius;

        void show_periphery(){ // show_periphery(), 顯示出圓周長

            System.out.println("periphery="+2*this.pi*this.radius);
    
        } 

        void setRadius(double r){
            radius = r;
        }

        
        
}       
public class lab9 {
    public static void main(String[] args) {
        
        CCircle cir1 = new CCircle();

        cir1.setRadius(3.0);
        
        cir1.show_periphery();

    }
}

/*
(a) 在 main() 中建立一個 CCircle 類別型態的物件 cir1
(b) 在 main() 中將 cir1 物件的資料成員 radius 設為 3.0
(c) 用關鍵字 this 修改 CCircle 類別中的函數成員
(d) 在 main() 中呼叫 show_periphery() 函數 
*/