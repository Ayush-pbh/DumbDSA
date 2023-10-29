public class StringWordReversal {
    public static void main(String[] args) {
        
        String str = "Apple.a day.keeps doctor.away!";
        
        String[] arr = str.split(".");
        // String[] arr = {"Apple", "a", "day", "keeps", "doctor", "away!"};
        String temp = " ";
  
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
