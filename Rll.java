// link list all program of insert  insert last , delete etc
import java.util.*;

class Ll{
    Node head;
    class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
    public Node insertB(int data){// insert into node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public Node insertN (int data){// to insert into last 
        Node nenode = new Node(data);
        nenode.next= head;
        head = nenode;
        return head;

    } // to delete a no into node 
    public void delete(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("delted "+ head.data);
        head = head.next;
    }
    public void insertE(int data)// to insert in to end
        {
            Node newnNode = new Node(data);
            if (head == null){
                head = newnNode;
                return;
            }
            Node temp = head;
            while(temp.next!=null)
            temp= temp.next;
         temp.next =newnNode;   
    }
    public void insertAfter(int n ,int data){
        int size = calcSize(head);
        if(n <1 || n>size){
            System.out.println("cannot insert \n");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            while(--n > 0)
            temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void display(){// to display
        Node node = head;
        while (node != null)
        {
            System.out.println(node.data +",");
            node = node.next;}
            System.out.println();

         }
         public int calcSize(Node node){
            int count = 0;
            while (node != null)
            {
                count++;
                node = node.next;
            }
            return count;
         }
          class Rll{
            public static void main (String args[])
          {
            Ll l = new Ll();
           // l.insertB(99);
            //l.insertB(87);
            //l.insertB(55);
            //l.insertE(33);
            //l.insertE(48);
            //l.insertN(88);
            //l.insertN(89);
            //l.insertN(83);
            l.insertAfter(1 ,66);
            l.insertAfter(2,65);

  
            l.display();
          //l.delete();
          //l.display();
        }
    }
}