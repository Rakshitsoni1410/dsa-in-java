class Lined {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;

        }
        System.out.println("end ");

    }

    public Node insertB(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;

    }

    public void reverse() {
        Node pointer = head;
        Node previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
        }
        head = previous;
    }
}

public class Rmain {
    public static void main(String args[]) {
        Lined l = new Lined();
        l.insertB(55);
        l.insertB(33);
        System.out.println("linked list before ");
        l.display();
        l.reverse();
        System.out.println("linked list after reverse ");
        l.display();
    }
}