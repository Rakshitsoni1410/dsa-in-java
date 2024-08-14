import java.util.*;
public class popdemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(50);
        stack.push(58);
        stack.push(20);
        stack.push(10);
        stack.push(15);
        System.out.println("initial Stack " +stack);
        System.out.print("popped element"+ stack.pop());
        
        System.out.print("popped element"+ stack.pop());
        
    System.out.print("Stack after pop operataion " +stack);
    }
}
