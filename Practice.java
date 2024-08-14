import java.util.*;

class Ll{
    Node head;
    class Node{
        int data; Node next;
        Node (int d)
        {
            data =d;
            next = null;
        }
    }

public Node insertN(int data){
    Node newnode= new Node(data);
    newnode.next= head;
    head = newnode;
    return head;
}
public void display(){
    Node  node = head;
    while (node != null) {
        System.out.println(node.data + "");
      node=  node.next;
    }
    System.out.println();
}
}
public class Practice {
 public static void main(String[] args) {
    Ll l = new Ll();
    l.insertN(55);
    l.insertN(7);
    l.insertN(8);
    l.display();
 }
    
}