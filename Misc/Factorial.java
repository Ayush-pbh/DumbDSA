
import java.util.Scanner;
public class Factorial {
    static int getFactorialFor(int num){

        int factorial = 1;
        for (int i = 1; i <=num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    

    static int getFactorial(int num){
        if(num == 0){
            return 1;
        }
        return getFactorial(num-1)*num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number For Factorial");
        
        int ff = getFactorialFor(sc.nextInt());
        
        System.out.println("Factorial = "+ff);
    }   
}
