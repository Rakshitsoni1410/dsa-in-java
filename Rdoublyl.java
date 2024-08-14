import org.w3c.dom.Node;

class Doublylinklist{
     Node head; 
      class Node {
        int data;
        Node prev, next;
        Node(int x){
            data =x;
            next = null;
         e   prev = null;

        }
      }
      public void insertBe(int data){
        Node freshnode= new Node(data);
        freshnode.next = head;
        freshnode.prev = null;
        if(head != null)
        head.prev = freshnode;
        head=freshnode;
      }
      public void inend(int data){
        Node freshnode = new Node(data);
        freshnode.next= null;
        if(head == null){
            head = freshnode;
            freshnode.prev = null;
            return;
        }
        Node last = head;
        while (last.next !=null)
        last = last.next;
        last.next = freshnode;
        freshnode = last;

      }
      public void insertAfterpos(int  n , int data)
      int len = getLength(head);
      if(n == 0){
        insertBe(data);
          return;}
          if (n == len){
            inend(data);
            return;

          }
          if( n<1 || len  < n ){
            System.out.println(" invaliad postion");
            else{
              Node freshnode = new Node(data);
              freshnode. next = null;
              freshnode.prev = null;
              Node nthNode = head;
              while(-- n >0){
                nthNode = nthNode.next;

              }
              Node nextNode = nthNode.next;
              nextNode.prev = freshNode;
              freshNode.next = nextNode;
              freshNode.prev = nthNode;
              nthNode.next = freshNode;
            }
          }
          public void printl(){
            Node node = head;
            Node end = null;
            System.out.println(" \n forward");
            while(node != null){
              System.out.println(node.data+"");
              end = node;
              node = node.next; 
            }
            System.out.println("\n  back ");
            while(end != null){
                System.out.println(end.data + "");
                end = end.prev;
            }
            System.out.println();
        }
        public int getLength(Node node){
            int size = 0;
            while(node != null){
                node = node.next;
                size++;
            }
            return size;
        }
}
public class Rdoublyl {

    public static void main(String[] args) {
 Doublylinklist dd = new Doublylinklist();
 dd.insertBe(89);
 dd.insertBe(66);
 dd.printl();
         
    }
}