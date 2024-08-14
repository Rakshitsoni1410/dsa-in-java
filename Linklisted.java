import java .util.*;

    public class Linklisted 
{
    Node  head ;
    int size;
     public Linklisted(){
        head= tail=null;
        size=0;
      }
     class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        
        }
        }
        public static void main(String[] args) {
        Node  node1 = new Node(44);
        Node node2 = new Node(445);
        Node node3 = new Node(6954);
        Node node4 = new Node(55);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        System.out.println(node1.data);
    }
}