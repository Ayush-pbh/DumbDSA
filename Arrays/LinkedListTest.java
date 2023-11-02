class LL{
    int data;
    LL nxt;
    LL(){
        
    }
    LL(int d){
        this.data = d;
        this.nxt = null;
    }
    LL(int d, LL n){
        this.data = d;
        this.nxt = n;
    }
}
public class LinkedListTest
{
    public static void main(String[] args){
        System.out.println("Testing Linked List");
        LL o1 = new LL(10);
        LL o2 = new LL(20);
        LL o3 = new LL(30);
        LL o4 = new LL(40);
        
        o1.nxt = o2;
        o2.nxt = o3;
        o3.nxt = o4;
        
        LL crr = o1;
        while(crr!=null){
            System.out.println(crr.data);
            crr = crr.nxt;
        }
    }
}
