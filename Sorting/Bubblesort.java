// Optimized java implementation of Bubble sort

import java.io.*;

class Bubblesort {
	
	static void bubbleSort(int arr[], int n)
	{
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
            System.out.println("----");
           // System.out.print("i => "+i);
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
              //  System.out.print("j => "+j);

				if (arr[j] > arr[j + 1]) {
                   // System.out.print("Swapping j,j+1 :"+j+" "+(j+1));			
					// Swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
                System.out.println();
			}
			// printArray(arr, arr.length);
			// If no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}
static void bubbleSortDLL(DLL mylist)
	{
		int i, j, temp;
		int n = mylist.getLength();
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
            System.out.println("----");
           // System.out.print("i => "+i);
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
                //System.out.print("j => "+j);

				if (mylist.getData(j) > mylist.getData(j + 1)) {
                   // System.out.print("Swapping j,j+1 :"+j+" "+(j+1));			
					// Swap arr[j] and arr[j+1]
					temp = mylist.getData(j);
					mylist.updateData(j, mylist.getData(j+1)) ;
					mylist.updateData(j+1, temp);
					swapped = true;
				}
                System.out.println();
			}
			// printArray(arr, arr.length);
			// If no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	// Function to print an array
	static void printArray(int arr[], int size)
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[])
	{
		// int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		// int n = arr.length;
		// bubbleSort(arr, n);
		// System.out.println("Sorted array: ");
		// printArray(arr, n);
        DLL mylist = new DLL(1);
		mylist.insertEnd(4);
		mylist.insertEnd(2);
		mylist.insertEnd(5);
		mylist.insertEnd(-10);
		bubbleSortDLL(mylist);
		mylist.printForward();


	}

}

// 64, 34, 25, 12, 22, 11, 90
// 34, 64, 25, 12, 22, 11, 90
// 34, 25, 64, 12, 22, 11, 90
// 34, 25, 12, 64, 22, 11, 90
// 34, 25, 12, 22, 64, 11, 90
// 34, 25, 12, 22, 11, 64, 90

// 34, 25, 12, 22, 11, 64, 90
// 25, 12, 22, 11, 34, 64, 90

// 25, 12, 22, 11, 34, 64, 90
// 12, 22, 11, 25, 34, 64, 90

// 12, 22, 11, 25, 34, 64, 90
// 12, 11, 22, 25, 34, 64, 90

// 11, 12, 22, 25, 34, 64, 90
