
public class Reverselink {
     Node head;
     class Node{
        String data;
        Node next;
         
        Node (String data){
            this.data=data;
            this.next=null;

        }
     }
     public void adft(String data){
        Node newNode = new Node(data);
        if (head== null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     public void addlast(String data)
     {       Node newNode = new Node(data);
        if (head == null) {
                head = newNode;
                return;
             }
             Node currNode = head;
             while (currNode.next != null) {
                currNode =currNode.next;
             }
             currNode.next = newNode;
            }
            public void printlist()
            {
                if (head == null){
                    System.out.println("list is empty");
                    return;
                }

                Node currNode = head;
                while (currNode  != null) 
                {
                    System.out.print(currNode.data+"-> ");
                   currNode =currNode.next;
                }
                System.out.print("null");
            }
            public int reverseIterate() 
            {
                if (head == null || head.next == null){
                    return head;
                }
                Node preNode = head;
                Node currNode = head.next;
                while (currNode != null) {
                    Node nextNode = currNode.next;
                    currNode.next =  preNode;
                    preNode = currNode;
                    currNode = nextNode;
                }
            
                head =  preNode;
                return head;
            }
            public static void main(String[] args) {
                    Reverselink r = new Reverselink();
                    r.addlast("hi");
                    r.addlast("raj");
                    r.addlast("soni");
                    r.printlist();
            }
}
