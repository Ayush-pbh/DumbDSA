

class School{
    public static void main(String[] args) {
        System.out.println("Welcome to School");

       
        MyStudent abhay = new MyStudent();
        MyStudent lokesh = new MyStudent();
        MyStudent vishant = new MyStudent();
        MyStudent ayush = new MyStudent();
        
        MyStudent[] students = new MyStudent[]{abhay, lokesh,vishant,ayush};

        new MyStudent().inputDetails();

        // for (int i = 0; i < students.length; i++) {
            
        //     System.out.println("------------------------");
        //     students[i].inputDetails();
            
        //     // students[i].printDetails();
        // }


    }
}