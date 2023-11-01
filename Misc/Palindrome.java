import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(String str){
        boolean result = false;

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            
            reversed = reversed + str.charAt(i);

        }

        if(str.equals(reversed)){
            result = true;
        }

        return result;
        
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Input String to check if Palindrome or Not : ");
        String str = sc.nextLine();

        Boolean r = isPalindrome(str);
        System.out.println("Result  : "+r);
    }
}
