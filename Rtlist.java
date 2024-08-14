class Rtlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node insertBe(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void insertAfter(int n, int data) {
        int size = calcSize(head);
        if (n < 1 || n > size) {
            System.out.println("cannot insert");
        } else {
            Node newNode = new Node(data);
            Node temp = head;

            for (int i = 1; i < n; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();

    }

    public int calcSize(Node node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }
}

public class main {
    public static void main(String args[]) {
        Rtlist r = new Rtlist();
        r.insertBe(90);
        r.display();
        r.insertAfter(1, 80);
        r.display();
    }
}