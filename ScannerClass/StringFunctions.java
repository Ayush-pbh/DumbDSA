import java.util.Scanner;

class StringFunctions{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();

        System.out.println("Original String => *"+str+"*");

        // Length of a string
        System.out.println(str.length());

        // Print a character from str at specific index 
        int index = 4;
        System.out.println(str.charAt(index));

        // Sub String of a String
        index = 2;
        System.out.println(str.substring(index));

        // Substring of two integers i,j ---> [i,j-1]
        System.out.println(str.substring(0,1));

        // Concat 
        System.out.println(str.concat("AddedString"));

        // IndexOf(elem)
        System.out.println(str.indexOf("A"));

        // Last Index of
        System.out.println(str.lastIndexOf("A"));

        // Equals
        // Boolean b = str.equals(sc.nextLine());
        // System.out.println(b);

        // // EqualsIgnoreCase
        // b = str.equalsIgnoreCase(sc.nextLine());
        // System.out.println(b);

        // To Lower Case
        System.out.println(str.toLowerCase());

        // To Upper Case
        System.out.println(str.toUpperCase());

        // Trim
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        // replace (query,replace)
        System.out.println(str.replace('a', 'k'));

        // contains str.constains(str2)
        System.out.println(str.contains(sc.nextLine()));


    }
}