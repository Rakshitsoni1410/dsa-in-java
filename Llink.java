import java.util.*;

public class Main {
    public static void main(String[] args) {
        Llink l  = new Llink();
        l.insNode(85);
        l.display();
        l.delete(l.head);
    }
}

class Llink {
    Node head;
    class Node {
        int data;
        Node next;
        Node (int x){
            data =x ;
            next = null;
        }
    }
    public Node insNode(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
        return head;
    }
    public void delete(Node head)
    {
        if (head == null){
            System.out.println("list is empty , not possible to delete ");
            return;
        }
        System.out.println("deleted "+head.data);
        head = head.next;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.println(node.data+",");
            node = node.next;

        }
        System.out.println();
    }

}