import java.util.*;
public class Pushdemo {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();
        stack1.push("4");
        stack1.push("rakshit");
        stack1.push("soni");
        stack2.push("3");
        stack2.push("raxit");
        stack2.push("mandaliya");
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
