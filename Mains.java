class Linkll{
    Node head;
class Node{
    int data;
    Node next;
     Node  (int x){
        data =x;
        next = null;
     }
}
public Node inbeging(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    System.out.println("inserted"+data);
    return head;

}
public void inAfter(int n , int data){
    int size = calcSize(head);
    if(n<1 ||n>size){
        System.out.println("cann't insert ");
    }else{
        Node newNode = new Node(data);
        Node temp = head;
        while(--n>0)temp = temp.next;
        newNode.next= newNode;
    }
}
public void display(){
    System.out.println();
    Node node = head;
    while(node != null){
        System.out.println(node.data+"");
        node = node.next;
    }
    System.out.println();
}
public int calcSize(Node node){
    int size = 0;
    while(node!= null){
        node = node.next;
        size++;
    }
    return size;

}
}
public class Mains{
    public static void main(String[] args) {
        Linkll l = new Linkll();
        l.inbeging(85);
        l.inbeging(7);
           l.display();
        l.inAfter(1,87 );
        l.display();
        }
}