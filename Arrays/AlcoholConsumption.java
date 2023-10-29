
import java.util.Scanner;

public class AlcoholConsumption
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        
        System.out.println("Enter Number of subjects");
        int numSub = sc.nextInt();
        
        int sum = 0; //To store marks sum
        
        for(int i=1; i<=numSub;i++){
            System.out.print("Enter Marks in Subject "+i+" :");
            sum += sc.nextInt();
        }
        
        double percentage = ( sum/(numSub * 100) ) * 100;
        System.out.println("Percentage : "+ percentage+"%");
    }
}
