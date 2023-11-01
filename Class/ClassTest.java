import java.util.Scanner;
class PetStore {
    
    static Pet[] mypets = new Pet[5];
    static Scanner sc = new Scanner(System.in);

    static void dummyData(){

        mypets[0] = new Pet("Mimi", 1.5f, "cat", "1-09-2022", "friendly, shy");
        mypets[1] = new Pet("chochu", 1.5f, "hamster", "1-09-2022", "friendly, shy");
        mypets[2] = new Pet("roxy", 1.9f, "dog", "17-01-2022", "aggressive, haramkhor");
        mypets[3] = new Pet("jenny", 10, "dog", "10-10-2013", "friendly, cute");
    }

    static void buyPet(){
        System.out.println("\n\nList of Pets");
        for (int i = 0; i < mypets.length-1; i++) {
            System.out.println("-------------------------------");
            System.out.println("Pet Index : "+ i);
            System.out.println("Name : "+ mypets[i].nickname);
            System.out.println("Age : "+ mypets[i].age);
            System.out.println("Breed : "+ mypets[i].breed);
            System.out.println("DOB : "+ mypets[i].birthdate);
            System.out.println("Nature : "+ mypets[i].nature);
            System.out.println("-------------------------------");
        }

        System.out.println("Select Pet to Buy : ");
        int ch = sc.nextInt();
        if(ch>=0 && ch <mypets.length){
            System.out.println("Congratulations you are the proud parent of "+mypets[ch].nickname);
        }
        else{
            System.out.println("Invalid Input! Try Again.");
        }

    }

   static  void sellPet(){
            System.out.println("Sell Pet ");
    }

   static void searchPet(){
            System.out.println("Search pet");
            // Linear search on objects.
            // Kuch input lenge breed filter. (String)
            // For Loop chalana linear search ke liye.
            // Match kariye pets aur input ki breed.
            // Result Print kariye.
    }

    public static void main(String[] args) {
        
        dummyData();
        
        while(true) {
            System.out.println("List of Options : ");
            System.out.println("Buy Pet : 1");
            System.out.println("sell pet : 2");
            System.out.println("search pet : 3");
            int ch = sc.nextInt();
            if(ch==1){
                buyPet();
                break;
            }
            else if(ch==2){
                sellPet();
                break;
            }
            else if(ch==3){
                searchPet();
                break;
            }
            else{
                System.out.println("Invalid Input! Try Again. ");
                continue;
            }
        }
    }

}

class Pet{
    
    String breed;    
    float  age;
    String nickname;
    String nature;
    String birthdate;
    
    // Constructor
    Pet(String nickname, float age, String breed, String birthdate, String nature){
        this.age=age;
        this.breed=breed;
        this.nickname=nickname;
        this.birthdate=birthdate;
        this.nature=nature;
    }
}

class Food {
    String Fname;
    int cal;
    float weight;
    long expirydate;
    
    Food(String Fname, int cal, float weight, long expirydate){
        this.Fname = Fname;
        this.cal = cal;
        this.weight  = weight;
        this.expirydate = expirydate;  

    }

}