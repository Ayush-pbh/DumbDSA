import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check Palindrome or not : ");
        int num = sc.nextInt();
        
        int reversednum=0 , remainder=0;    
        int originalnum= num;
        while(num!=0){
            remainder = num%10;
            reversednum = reversednum *10 + remainder;
            num/=10;
        }
        if (reversednum==originalnum){
            System.out.println(originalnum+"is a palindrome");
        }
        else{
             System.out.println(originalnum+"is not a palindrome");
        }
    }
    
}
