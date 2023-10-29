import java.util.Scanner;

class ScannerTest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Boolean Inputs
        System.out.println("Enter Boolean Input : ");
        Boolean BInput = sc.nextBoolean();

        System.out.println("Output : "+BInput);

        // Int Inputs
        System.out.println("Enter Int Input : ");
        int IntInput = sc.nextInt();

        System.out.println("Output : "+IntInput);
        
        // Short Inputs
        System.out.println("Enter Short Input : ");
        short ShortInput = sc.nextShort();

        System.out.println("Output : "+ShortInput);

        // Long Inputs
        System.out.println("Enter long Input : ");
        long LongInput = sc.nextLong();

        System.out.println("Output : "+LongInput);

        // Float Inputs
        System.out.println("Enter Float Input : ");
        float FloatInput = sc.nextFloat();

        System.out.println("Output : "+FloatInput);


        // Double Inputs
        System.out.println("Enter Double Input : ");
        double DoubleInput = sc.nextDouble();

        System.out.println("Output : "+DoubleInput);


        // String Inputs
        System.out.println("Enter String Input : ");
        String StringInput = sc.nextLine();

        System.out.println("Output : "+StringInput);

        // String word Inputs
        System.out.println("Enter String Input : ");
        StringInput = sc.next();

        System.out.println("Output : "+StringInput);
    }
}