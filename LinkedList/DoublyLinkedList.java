class Node{
    int data;

    Node next;
    Node prev;
}
public class DoublyLinkedList {
    public static void main(String[] args) {
       
        Node n1  = new Node();
        n1.prev = null;
        n1.data = 10;
        
        Node n2 = new Node();
        n2.prev = n1;
        n2.data = 20;
        n1.next = n2;

        Node n3 = new Node();
        n3.prev = n2;
        n3.data = 30;
        n2.next = n3;
        
        Node n4 = new Node();
        n4.prev = n3;
        n4.data = 40;
        n3.next = n4;

        // Traversal
        System.out.println("Forward Traversal");
        Node HEAD = n1;
        
        while (HEAD != null) {
            System.out.println(HEAD.data);
            HEAD = HEAD.next;
        }

        System.out.println("-----------");
        
        System.out.println("Reverse Traversal");
        Node TAIL = n4;
        while (TAIL != null) {
            System.out.println(TAIL.data);
            TAIL = TAIL.prev;
        }



    }    
}
