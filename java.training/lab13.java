class Circle{
    private static double pi=3.14;
    private double radius;
    private double area;

    public Circle(double r){
        radius = r;
        area = radius*radius*pi;
    }

    public static double compare(Circle[] c) {
        double sum = 0.0;
        for(int i=0; i < c.length; i++){
            sum+=c[i].area;
        }
        return sum;
    }
}
public class lab13 {
   public static void main(String[] args) {
    Circle[] cir = new Circle[3];

    cir[0] = new Circle(1.0);
    cir[1] = new Circle(4.0);
    cir[2] = new Circle(2.0);
    System.out.println("圓面積總和:"+Circle.compare(cir));
   } 
}
