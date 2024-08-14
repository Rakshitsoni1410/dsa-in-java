
class Linkedlist{
    Node  head;

    class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;

        }
    }
    public void searchNode(int data){
        Node current = head;
        //int i = 1; 
        boolean flag = false;
        if (head == null){
            System.out.println("list is empty");
        }
        else{
            while(current != null){
                if (current.data == data) {
                    flag = true;
                    break;
                }
               // i++;
                current  = current.next;
            }
        }
        if(flag)
        System.out.println("element is present at the this position");
        else
        System.out.println("element is not in list");
    }
    public Node insert (int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

public void display()
{
    Linedlist.Node node = head;
    while(node!= null)
{
    System.out.println(node.data+"");
    node = node.next;
}
System.out.println("\n");}}
public class Serchlink {
    public static void main(String[] args) {
        Linkedlist t = new Linkedlist();
        t.insert(55);
        t.insert(53);
        t.insert(44);
        t.searchNode(54);
        t.display();
    }
    
}
