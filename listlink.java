public class listlink {

    Node head;

    class Node{
        int  data ;
        Node next;

        Node (int x){
            data = x;
            next = null;
        }
    }
    public Node insertStart(int data){
        Node newNOde = new Node(data);
        newNOde.next = head;
        head = newNode;
        return head;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertPosition(int n, int data)
    {
        int size = calcsize(head);
        if (n < 1  || n>size+1){
            System.out.println("Invalid position");
            return;
        }
        if(n == 1) {
            insertStart(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        while (--n >1) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void display()
    {
        Node node = head;
        while (node !=null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    public int calcsize(Node Node){
        int size = 0;
        Node node = head;
        while (node!=null) {
            node = node.next;
            size++;
        }
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        listlink dd = new listlink();
        dd.insertStart(88);dd.insertStart(33);
        dd.display();
        dd.insertLast(87);
        dd.insertLast(99);
        dd.insertPosition(1, 100);
        dd.insertPosition(5, 150);
        dd.display();
    }
}