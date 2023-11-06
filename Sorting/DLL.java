
class Node{
    Node prev;
    int data;
    Node next;
}

public class DLL {
    static Node HEAD;
    static Node TAIL;

    DLL(int a){
        Node temp = new Node();
        temp.data = a;
        temp.prev = null;
        temp.next = null;

        HEAD = temp;
        TAIL = temp;
    }
    void deleteAtIndex(int index){
        int ct = 0;
        Node n = HEAD;

        while (ct != (index-1)) {
            n = n.next;
            ct++;    
        }
        n.next.next.prev = n;
        n.next = n.next.next;

    }
    int getLength(){
        int ct = 0;
        Node list= HEAD;
        while(list != null){
            list = list.next;
            ct++;
        }
        return ct;
    }

    void insertStart(int dataToInsert){
        Node temp = new Node();
        temp.data = dataToInsert;
        temp.prev = null;
        temp.next = HEAD;
        HEAD.prev = temp;
        HEAD = temp;
        // 
        // HEAD.prev = TAIL;
    }

    void insertEnd(int dataToInsert){
       Node temp = new Node();
       temp.data = dataToInsert;
       TAIL.next = temp;
       temp.prev = TAIL;
       temp.next = null;
       TAIL = temp;
       //
       //TAIL.next = HEAD;
    }
    static int getData(int index){
        int ct = 0;
        Node n = HEAD;
        while (ct != index) {
            n = n.next;
            ct++;
            
        }
       return n.data;
    }
    static void  updateData(int index, int data){
        int ct = 0;
        Node n = HEAD;
        while (ct != index) {
            n = n.next;
            ct++;
            
        }
        n.data= data;
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
        temp.prev = n;

        n.next.prev = temp;
        n.next = temp;
    }
    void printForward(){

        System.out.println("Forward Print");
        System.out.println("HEAD : "+HEAD.data+", TAIL :"+TAIL.data);

        Node n = HEAD;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }
    void printReverse(){

        System.out.println("Reverse Print");
        System.out.println("HEAD : "+HEAD.data+", TAIL :"+TAIL.data);

        Node n = TAIL;
        while(n!=null){
            System.out.println(n.data);
            n=n.prev;
        }

    }
}

class Runner{
    public static void main(String[] args) {
        
        DLL mylist = new DLL(1);
        mylist.insertEnd(2);
        mylist.insertEnd(3);
        mylist.insertEnd(4);
        mylist.insertStart(0);
        mylist.insertAtIndex(100, 2);
        mylist.deleteAtIndex(3);
        System.out.println("Length : "+mylist.getLength());
        mylist.printForward();
        mylist.printReverse();

        
    }
}
