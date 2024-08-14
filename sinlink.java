import java .util.*;

public class sinlink {
Node head;

class Node{
    int data;
    Node next;

    Node(int x)
    {
        data =x;
        next = null;
    }
}
public Node insertbeging(int data)            
{
    Node newNode = new Node(data);
    newNode.next =head;
    head = newNode;
    System.out.println("insert "+data);
    return head;
}
public void display()
{
    System.out.println();
    Node node = head;
 while (node != null) {
    System.out.println(node.data + "");
    node = node. next;

    
 }
 System.out.println();
}

    
}
  public class Main
{
    public static void main(String[] args) {
        sinlink s = new sinlink();
        s.insertbeging(55);
        s.insertbeging(88);
        s.display();
    }
}