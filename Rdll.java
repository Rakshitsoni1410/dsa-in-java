class Node {
    int data;
    Node next,prev;
    Node(int x){
        data = x;
        next= null;
        prev = null;

    }
}
class Dd{
    Node head;// insert from beginning
public void insertBe(int data){
    Node freshNode = new Node(data);
    freshNode.next = head;
    freshNode.prev = null;
    if(head !=null){
        head.prev = freshNode;
        head= freshNode;
    }
}
/*public void insertEnd(int data){
    Node freshNode = new Node(data);
    freshNode.next = null;
    if (head == null){
        head = freshNode;
        freshNode.prev = null;
        return;

    }
    Node last = head;
    while(last.next != null)
    last = last.next;
    last.next = freshNode;
    freshNode.prev =last;
}*/
public void deleteI (){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
    else{
        if(head != null){
            head = head.next;
        }
        else{
            head = null;

        }
    }
}

    public void display(){
        Node node = head;
        Node end  = null;
        System.out.println("\n in forward");
        while(node != null){
            System.out.println(node.data+"");
            end = node;
            node =node.next;
        }
            System.out.println("\n in backward:");
        while(end !=null){
            System.out.println(end.data+"");
            end = end.prev;
        }
        System.out.println();
    
}
public void insertAfterpos(int n ,int data){
    int len = getLengnth(head);
    if(n == 0){
        insertBe(data);
        return;
    }
    if(n == len){
       // insertEnd(data);
        return;
    }
    if(n<1 || len <n)
    System.out.println("invalid position");
    else{
        Node freshnodNode = new Node(data);
        freshnodNode.next = null;
        freshnodNode.prev = null;
        Node nthNode = head;
        while(--n > 0)
        {
            nthNode = nthNode.next;

        }
        Node nextNode= nthNode.next;
        nextNode.prev = freshnodNode;
        freshnodNode.next= nextNode;
        freshnodNode.prev = nthNode;
        nthNode.next = freshnodNode;

    }
}
public int getLengnth( Node node)
{
    int size = 0;
    while (node != null) {
        node = node.next;
        size++;
    }
    return size;
}}
 class Rdll {
    public static void main(String[] args) {
        Dd d = new Dd();
        d.insertBe(44);
        d.insertBe(22);
        d.insertBe(77);
        d.insertBe(11);
        d.display(); 
        d.deleteI();
        
      //  d.insertEnd(55);
        //d.insertEnd(447);
        //d.insertEnd(21);
        d.display();
        //d.insertAfterpos(2, 33);
        d.display();       
    }    
}
