class NotTriangle extends Exception{
}
class EquilateralTriangle extends Exception{
}
class NotEquilateralTriangle extends Exception{
}

class triangle{
    private int a, b, c;
    public void triangle(int a, int b, int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{
        if((a+b)<c ||(a+c)<b ||(b+c)<a){
            throw new NotTriangle();
        }
        else if(a==b && a==c && b==c){
            throw new EquilateralTriangle();
        }
        else{
            throw new NotEquilateralTriangle();
        }
    }
}


public class lab21 {
    public static void main(String[] args) {
        int a=3, b=3, c=3;
        triangle t1 = new triangle();

        try{
            t1.triangle(a, b, c);
        }
        catch(NotTriangle e){
            System.out.println("不構成三角形");
        }
        catch(EquilateralTriangle e){
            System.out.println("這是正三角形");
        }
        catch(NotEquilateralTriangle e){
            System.out.println("這不是正三角形");
        }
    }
}