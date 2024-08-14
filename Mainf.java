class Llinlen{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int x)
        {
          data =x;
          next =null;  
        }
    }
    public void inEnd(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            System.out.println(newNode.data+"inserted");
            return;

        }
        Node temp =head;
      while(temp.next!= null)
      temp = temp.next;
      temp.next = newNode;
      System.out.println(newNode.data+"inserted"); 
    }
    public void display(){
        System.out.println();
        Node node = head;
        while(node!=null){
            System.out.println(node.data+"");
            node =node.next;

        }
        System.out.println();
    }
}
public class Mainf{
    public static void main(String args[])
{
    Llinlen e = new Llinlen();
    e.inEnd(5);
    e.inEnd(4);
    e.inEnd(2);
    e.display();
    
    
}}