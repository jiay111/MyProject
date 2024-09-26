import java.util.*;

public class lab22 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        
        h1.add(36);
        h1.add(15);

        TreeSet<Integer> t1 = new TreeSet<Integer>();

        t1.add(52);
        t1.add(23);
        t1.add(32);
        t1.add(69);
        t1.add(10);
        t1.add(7);
        t1.add(36);
        t1.add(15);
        
        //c
        System.out.println("h1元素內容:"+h1);
        System.out.println("t1元素內容:"+t1);
        
        //d
        if(t1.contains(32)){
            t1.remove(32);
            System.out.println("刪除後t1元素內容"+t1);
        }
        else{
            System.out.println("t1中沒有元素32");
        }

        //e
        System.out.println("t1中是否包含h1中所有元素?"+t1.containsAll(h1));

        
    }
}
