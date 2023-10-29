import java.util.Scanner;

 class StudentMarks{


        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter ur name :");
            String name = sc.nextLine();

            System.out.println("Enter ur 1st subject name  : ");
            String subject_1st = sc.next();
           
            System.out.println("Enter your 1st subject marks:");
            float Marks1st = sc.nextInt();

            System.out.println("Enter your 2nd subject name ");
            String subject_2nd = sc.next();


            System.out.println("Enter your 2nd subject marks:");
            float Marks2nd = sc.nextInt();
            
            float obtainedMarks = Marks1st+Marks2nd;
            System.out.println("obtained Makrs : " + obtainedMarks);

            System.out.println("Total Marks = ");
            float TotalMarks = sc.nextInt();

            Float Percentage = (obtainedMarks/TotalMarks)*100;          
        
        }
 }
