class Shape{

    //public double pi = 3.14;

    public double area(){
        return 0.0;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double r){
        radius = r;
    }
    
    public double area(){
        return (radius*radius*3.14);
    }
}

class Square extends Shape{
    double len;

    public Square(double l){
        len = l;
    }

    public double area(){
        return (len*len);
    }
}

class Triangle extends Shape{
    double bot;
    double hei;

    public Triangle(double b,double h){
        bot = b;
        hei = h;
    }

    public double area(){
        return (bot * hei / 2);
    }
}

public class lab16{
    public static void main(String args[]){
        Shape cir1 = new Circle(1.0);
        Shape cir2 = new Circle(2.0);
        Shape squ1 = new Square(3.0);
        Shape squ2 = new Square(4.0);
        Shape tri1 = new Triangle(5.0,6.0);
        Shape tri2 = new Triangle(7.0,8.0);

        double lar[] = new double[6];

        System.out.println();

        lar[0] = cir1.area();
        lar[1] = cir2.area();
        lar[2] = squ1.area();
        lar[3] = squ2.area();
        lar[4] = tri1.area();
        lar[5] = tri2.area();

        System.out.println("cir1:"+cir1.area());
        System.out.println("cir2:"+cir2.area());
        System.out.println("squ1:"+squ1.area());
        System.out.println("squ2:"+squ2.area());
        System.out.println("tri1:"+tri1.area());
        System.out.println("tri2:"+tri2.area());
        System.out.println("Largest:"+largest(lar));
       
    }
    public static double largest(double a[]) 
    { 
        double max=a[0]; 
        for(int i=0;i<a.length;i++) 
            if(max<a[i]) 
                max=a[i]; 
        return max; 
     }
    
}
