import java.util.Scanner;

class scannernewValidAge{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your data");

        System.out.print("your name:");
         String stInput = sc.nextLine();

        System.out.print("your age:");
        int IntInput = sc.nextInt();
        
        if(IntInput>=18)
        System.out.print("Congratulations! "+stInput+",  You may pour.");
        else
        System.out.print("sorry "+stInput+" you are not eligible");

     }
}