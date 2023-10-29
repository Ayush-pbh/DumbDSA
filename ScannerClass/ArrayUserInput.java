import java.util.Scanner;
class ArrayUserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Array length : ");
        int len= sc.nextInt();
        
        int[] myarr = new int[len];


        for(int i=0; i<len;i++){

            System.out.println("Enter Data for index "+ i);
            myarr[i] = sc.nextInt();
        }

        System.out.println("What do you want to search? : ");
        int query = sc.nextInt();
        
        int result  = -1;

        for(int i=0; i<len;i++){
            if(query == myarr[i]){
                result = i;
                break;
            }
        }

        if(result != -1){
            System.out.println(query + " Found @ "+ result);
        }
        else{
            System.out.println(query + ", Not Found");
        }
        
    }
}