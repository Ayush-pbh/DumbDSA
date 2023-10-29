public class ArrayRotationUsingReversal {
    
	static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
        System.out.println("");

	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int d = 4;

		// in case the rotating factor is
		// greater than array length
		d = d % n;
        int temp, start = 0, end = 0;

        // First rotation
        start = 0;
        end = n-1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
        printArray(arr);
        // Rotation 1 end

        // ROtation 2
        // Second rotation
        start = 0;
        end = n-1-d;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
        printArray(arr);
        // Rotation 2 end

        // Third rotation
        start = n-d;
        end = n-1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
        printArray(arr);
        // Rotation 3 end
        
	}    
}
