class CRectangle { 
    int width; 
    int height; 

    public CRectangle(int w,int h) { 
        width=w; 
        height=h; 
        System.out.println("constructor CRectangle(int w,int h) called"); 
    } 
    public CRectangle() { 
        width=10; 
        height=8;
        System.out.println("constructor CRectangle() called"); 
    } 
    public void show() { 
        System.out.println("width="+width); 
        System.out.println("height="+height); 
    } 
} 

public class lab11{ 
public static void main(String args[]) { 
    CRectangle rec1=new CRectangle(5,2); 
    rec1.show(); 
    CRectangle rec2=new CRectangle(); 
    rec2.show(); 
    } 
} 

/*

/* object rec1
constructor CRectangle(int w,int h) called
width=5
height=2

/* object rect2
constructor CRectangle(int w,int h) called
constructor CRectangle() called
width=10
height=8
 
*/