class LinkedList{
    Node head;
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
        int i = 1;
        boolean flag = false;
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(current != null){
                if(current.data == data){
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)System.out.println("element is present at position " + i);
        else
        System.out.println("element is not present ");
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Inserted " + data);
        System.out.println("Current LinkedList: ");
        current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println("\n");
    }
}
public class Searchlink {
    public static void main(String[]args)
{
        LinkedList r = new LinkedList();
        r.insert(9);
        r.insert(6);
        r.insert(7);
        r.searchNode(6);
        r.searchNode(8);
    }
}