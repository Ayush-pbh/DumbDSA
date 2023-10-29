public class ArrayReversalNoVariable {
    public static void main(String[] args) {
        
        double arr[] = { 1.23 , 2.45 , 3.2 , 4.0 , 5.4 , 6.0 , 7.7 , 8.2 , 9.1};

        double temp = 0.0;

        int start = 0, end = arr.length - 1;

        while(start < end){
            
            // Swapping Start
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // SAwapping End

            start++;
            end--;
        }

        // Array Printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
