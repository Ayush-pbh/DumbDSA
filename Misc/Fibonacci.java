import java.util.Scanner;
public class Fibonacci {
    static void printFibonacci(int n){
        
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {

          System.out.print(firstTerm + ", ");
    
          // compute the next term
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");

        int fibbo = sc.nextInt();
        printFibonacci(fibbo);

       
      }    
}
