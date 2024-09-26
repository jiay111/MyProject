import java.util.*;

public class lab23 {
    public static void main(String[] args) {
    
            LinkedList<String> llist = new LinkedList<String>();

            llist.add("apple");
            llist.add("guava");
            System.out.println("llist中所有元素:"+llist);

            ArrayList<String> alist = new ArrayList<String>();
            alist.add("tomato");
            alist.add("apple");
            alist.add("papaya");
            alist.add("grape");
            System.out.println("alist中所有元素:"+alist);
            alist.addAll(llist);
            System.out.println("llist加入alist:"+alist);

            System.out.println("第一個出現apple的索引值"+alist.indexOf("apple"));
            System.out.println("最後一個出現apple的索引值"+alist.lastIndexOf("apple"));


    }    
}
