import java.util.Scanner;
public class Armstrong {
    static boolean isArmstrong(int n){
        int cube=0, remainder;
        int originaln= n;
        while (n!=0){
             remainder=n%10;
            cube=cube+remainder*remainder*remainder;
            n=n/10;
            
        }
        if (originaln==cube)
        {
            return true;

        }
          return false;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("number is armstrong: "+ isArmstrong(n));
    }    
}
