class Ll{
    Node head;
    class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
    public void insertE(int data)// to insert in to end
    {
        Node newnNode = new Node(data);
        if (head == null){
            head = newnNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        temp= temp.next;
     temp.next =newnNode;   
}
 
    public void display(){// to display
        Node node = head;
        while (node != null)
        {
            System.out.println(node.data +",");
            node = node.next;}
            System.out.println();

         }}
         class Tr{
            public static void main(String args[])
            {
                Ll R = new Ll();
                R.insertE(55);
                R.insertE(44);
                R.display();
            } 
         }