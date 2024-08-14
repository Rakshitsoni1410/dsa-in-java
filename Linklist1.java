public class Linklist1 {
    Node head;
    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }
     public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
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
public void deleteFirst(){
    if (head == null) {
        System.out.println("the list is null");
        return;
        
    }
    head = head.next;
}
        public void deletelast(){
            if (head == null) {
                System.out.println("the list is empty");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
                
            }
            Node secondLast = head ;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode =lastNode.next;
                secondLast = secondLast.next;
                
            }
            secondLast.next = null;
        }
           

            
    public static void main(String[] args) {
        Linklist1 list = new Linklist1();
        list.addFirst("r");
        list.addFirst("a");
        list.addFirst("x");
        list.addFirst("i");
        list.addFirst("t");
        list.printlist();
     
        list.addlast("soni");
        list.printlist();
         
        list.addFirst("hi");
        list.printlist();
        
        list.deleteFirst();
        list.printlist();

        list.deletelast();
        list.printlist();
    }


}