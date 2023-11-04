import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        LL mylist = new LL();
        mylist.HEAD = new Node();
        mylist.HEAD.data = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 values");
        for (int i = 0; i < 5; i++) {
            
            int n = sc.nextInt();

            mylist.insertEnd(n);

        }
        mylist.printlist();
        System.out.println(mylist.getLength());
    }
}
