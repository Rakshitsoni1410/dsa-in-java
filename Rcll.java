class Node
{
    int element;
    Node next;
    public Node(int element)
    {
        this.element = element;
    
    }
}class cll{
    public Node head = null;
    public Node tail = null;
    int size = 0;
public void inbegin(int element)
{
    Node newEle = new Node(element);
    if (head == null)
    {
        head = newEle;
        tail = newEle;
        newEle.next = head;
    }
    else
    {
        newEle.next = head;
        head = newEle;
        tail.next =head;
    }
    size++;
}
public void insertAfter(int  n ,int data){
    int size = calcSize(head);
    if(n<1 ||n>size){
        System.out.println("cannot insert");
    }
    if(n==1){
        inbegin(data);
        return;
    }
    Node newnNode = new Node(data);
    Node temp = head;
    while(--n > 1)temp = temp.next;
    newnNode.next = temp.next;
    temp.next = newnNode;
}
public int calcSize(Node node){
    int size = 0;
    while (node!=tail) {
        node = node.next;
        size++;
    }
    return size+1;
}
public void display(){
    Node current = head;
    if (head == null){
        System.out.println("list is empty");
    }
    else {
        System.out.println("Node of circular link list");
        do{
            System.out.println(""+current.element);
        current = current.next;

        }while(current != head);
        System.out.println();
    }
}
}
class Rcll{
    public static void main(String[] args) {
    cll    c =new cll();
    c.inbegin(9);
    c.inbegin(55);
    c.inbegin(14);
    c.inbegin(7);
    c.display();
      c.insertAfter(2, 0);  
    }
}