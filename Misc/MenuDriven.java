import java.util.Scanner;

public class MenuDriven {
    
    static void T1(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void T2(){
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void T3(){
        for (int i = 0; i < 5; i++) {
            
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
    public static void main(String[] args) {
        
        // MENU Driven Program

       while(true){

        System.out.println("Please Select from menu : ");

        System.out.println("T1 : 1");
        System.out.println("T2 : 2");
        System.out.println("T3 : 3");

        System.out.print("Input : ");
        
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        if(ch==1){
            T1();
            break;
        }
        else if(ch==2){
            T2();
            break;
        }
        else if(ch==3){
            T3();
            break;
        }
        else{
            System.out.println("Invalid Input! Try Again. ");
            continue;
        }
        
       }
    }    
}
