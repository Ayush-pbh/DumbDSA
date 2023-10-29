
public class ArrayRotation
{
    public static void main(String[] args){
        int n = 3; //Number of Rotations
        
        //Rotating Left
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9}; //len = 9
        int temp; //Temp Variable 
        int len = arr.length;
        
        
        
        for(int x=0;x<n;x++){
            //Loop for number of rotations
            temp = arr[0];
            for(int i=1;i<len;i++){
                arr[i-1] = arr[i];
            }
            arr[len-1] = temp;
        }
        
        //Printing the array
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}
