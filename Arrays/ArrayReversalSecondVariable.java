public class ArrayReversalSecondVariable{
    
    

    static void reverse(char[] arr){
        // Make New Array to store Reversed Array
        int[] arr2 = new int[arr.length];   //Empty Array

    }
    public static void main(String[] args) {

        char arr[] = new char[]{'a', 'b', 'c', 'd'}; //len -> 4 [0,1,2,3]

        // Print array
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }        
        
        // 2nd variable
        char[] arr2 = new char[arr.length];
        
        // Fill reverse items in arr2
        for(int i=0;i<arr.length; i++){
            // arr2 ke opposite index me bharo arr index ka value
            arr2[(arr.length - 1) - i] = arr[i];
        }
        // Now arr2 contains reverse of arr
        // Fill arr new reverse arr2
        for(int i=0;i<arr.length; i++){
            arr[i] = arr2[i];

        }
        
        // Printing again!
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}