
class Node{
    int data;
    Node next;
    Boolean liked;
}

public class LL {
    public static void main(String[] args) {
        System.out.println("My Linked List Test : 10,20,30,40");
        
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        //Filling Data 
        n1.data = 10;
        n1.liked = true;

        n2.data = 20;
        n2.liked = false;
        
        n3.data = 30;
        n3.liked = true;
        
        n4.data = 40;
        n4.liked = false;
        
        n5.data = 50;
        n5.liked = true;

        // Linking
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        // // Printing All numbers : Traversal
        // Node HEAD = n1;
        // while(HEAD != null){
            
        //     System.out.println(HEAD.data);
        //     HEAD = HEAD.next;

        // }
        System.out.println("Right reversal Array");
        // Reversal Right
        n5.next = n1;
        n4.next = null;

        Node HEAD = n5;
        while(HEAD != null){
            if(HEAD.liked){
                System.out.println(HEAD.data);
            }
            HEAD = HEAD.next;

        }

    }   
}
