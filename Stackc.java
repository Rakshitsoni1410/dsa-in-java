import java.util.*;
import java.util.Stack;
 public class Stackc {
  public static void pushBottom(int data,Stack<Integer> s){
    if (s.isEmpty()) {
        s.push(data);
        return;
    }
int top =s.pop();
pushBottom(data, s);
s.push(top);
  }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(99);
        s.push(92);
        s.push(55);
        pushBottom(88,s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
 }