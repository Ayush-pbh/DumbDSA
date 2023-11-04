
class Node{
    int data;
    Node next;
}


public class LL {

    static Node HEAD;

    static void insertStart(int dataToInsert){
        Node temp = new Node();
        temp.data = dataToInsert;

        temp.next = HEAD;
        HEAD = temp;

    }

    static void insertAtIndex(int dataToInsert, int index){
        int ct = 0;
        Node n = HEAD;
        
        while (ct != (index-1) ) {
            n = n.next;
            ct++;
        }

        Node temp = new Node();
        temp.data = dataToInsert;
        
        temp.next = n.next;
        n.next = temp;
    }

    static void insertEnd(int dataToInsert){
        Node temp = new Node();
        temp.data = dataToInsert;
        temp.next = null;

        Node list = HEAD;

        while(list.next != null){
            list = list.next;
        }
        list.next = temp;
       
    }
    static void deleteAtIndex(int index){
        int ct = 0;
        Node n = HEAD;

        while (ct != (index-1)) {
            n = n.next;
            ct++;    
        }
        n.next = n.next.next;

    }
    static void printlist(){
         // Prining my list
        Node n = HEAD;
        while(n !=null ){
            System.out.println(n.data);
            n = n.next;
        }
    }
    static int getLength(){
        int ct = 0;
        Node list= HEAD;
        while(list != null){
            list = list.next;
            ct++;
        }
        return ct;
    }
    
    public static void main(String[] args) {

        
        HEAD = new Node();
        HEAD.data = 10;
     
        insertEnd(60);
        insertEnd(30);
        insertEnd(40);
        insertStart(-10);
        // insertAtIndex(100, 2);

        printlist();
        System.out.println("------------------");
        deleteAtIndex(2);
        printlist();


        // System.out.println("Length = "+ getLength(HEAD));
    }   
}
