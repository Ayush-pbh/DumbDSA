
import java.util.Scanner;
public class MyTable
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number for Multiplication Table");
        int num = sc.nextInt();
        
        //Loop for muliplication and prinintg
        for(int i=1; i<=10;i++){
            int product = i * num;
            String out = num + " X "+i+" = "+product;
            System.out.println(out);
        }
    }
}
