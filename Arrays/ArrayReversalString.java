public class ArrayReversalString {
    // public static void reverseStringUsingCharAt(String str){
    //     char temp;

    //     int start = 0, end = str.length() - 1;
        
    //     while(start < end){
            
    //         // temp = str.charAt(start);
    //         // str.charAt(start) = str.charAt(end);
    //         // str.charAt(end) = temp;

    //         start++;
    //         end--;
    //     }
    // }
    public static void main(String[] args) {

        // String arr[] = { "Abhay", "Ayush", "ChoMu", "Lokesh", "Vishant"};
        
        // String temp = "";
        
        
        String str = "Apple a day keeps doctor away";
        
        // reverseStringUsingCharAt(str);
        
        char[] arr = str.toCharArray();
        // char[] arr = {'A', 'p', 'p', 'l', 'e', ' ', 'a', ' ', 'd'...}; // Ye aur upar wali line same hai
        char temp;

        int start = 0, end = arr.length - 1;

        while(start < end){
            
            // Swapping Start
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Swapping End

            start++;
            end--;
        }

        // Array Printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
