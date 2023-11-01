import java.util.Scanner;
public class MyStudent
{  
    String name;
    int rollno;
    long  phone;
    String email;

    MyStudent(){}
    MyStudent(String name,int rollno,long phone,String email){
        this.name = name;
        this.rollno = rollno;
        this.phone = phone;
        this.email = email;
    }
    
    void printDetails(){
        System.out.println("Name = "+name+"\nRollNo = "+rollno+"\nEmail = "+email+"\nPhone = "+phone);
    }
    void inputDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name ????");
        this.name = sc.nextLine();

        System.out.println("phone");
        this.phone = sc.nextLong();
        
        System.out.println("email");
        this.email = sc.nextLine();
        
        System.out.println("roll no ???");
        this.rollno = sc.nextInt();

    }
}
