import java.util.*;
public class Linklist {

    public static void main(String[] args) {
        LinkedList<String> s2 = new LinkedList<String>();
        s2.add("aa");
        s2.add("rr");
        s2.addFirst("hello");
        s2.addLast("kem6o");
        s2.add(2,"majama");
        System.out.println(s2);
        s2.remove("aa");
        s2.remove(2);
        s2.removeLast();
        System.out.println(s2);

    }
}