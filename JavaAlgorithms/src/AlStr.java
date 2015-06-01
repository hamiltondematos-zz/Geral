
public class AlStr {

	private int[] array;
	private int arraySize;

	public AlStr(int arraySize) {
		this.arraySize = arraySize;
		this.array = new int[arraySize];
	}

	public static void generateRandomArray(int[] theArray) {

		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = (int) (Math.random() * 11); // from 0 to 10
		}
	}

	public static void main(String[] args) {

		AlStr a = new AlStr(15);

		// initialize array
		generateRandomArray(a.array);

		// print
		printArray(a.array);
		System.out.println();
/*
		// linear search
		int elementToSearch = 10;
		String elementFoundAtIndexes = linearSearchForValue(elementToSearch, a.array);
		System.out.println("Element " + elementToSearch + " found at indexes "	+ elementFoundAtIndexes);
		System.out.println();

		// bubble sort
		bubbleSort(a.array);

		// print
		printArray(a.array);
		System.out.println();

		// linear search
		elementToSearch = 10;
		elementFoundAtIndexes = linearSearchForValue(elementToSearch, a.array);
		System.out.println("Element " + elementToSearch + " found at indexes " + elementFoundAtIndexes);
		System.out.println();

		// binary search
		int numberToFind = 5;
		int elementFoundWithBinarySearch = binarySearchForValue(numberToFind,
				a.array);
		System.out.println("Binary search. Element " + numberToFind
				+ " found at index [" + elementFoundWithBinarySearch + "]");
		System.out.println();

		// insert in array
		a.array = insertInArray(24, a.array);
		printArray(a.array);
		System.out.println();

		// delete in array
		a.array = deleteInArray(5, a.array);
		printArray(a.array);
		System.out.println();
		

		// selection sort
		a.array = selectionSort(a.array);
		printArray(a.array);
		System.out.println();
		
*/
		// insertion sort
		a.array = insertionSort(a.array);
		printArray(a.array);
		System.out.println();
		
	}

	public static String linearSearchForValue(int theValue, int[] theArray) {
		String result = "";

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == theValue) {
				result += i + " ";
			}
		}

		if (result.isEmpty())
			return "none";

		return result.trim();
	}

	public static void bubbleSort(int[] theArray) {
		for (int i = theArray.length - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				if (theArray[i] < theArray[j]) {
					swap(theArray, i, j);
				}
			}

		}

	}

	public static void swap(int[] theArray, int indexA, int indexB) {
		int temp = theArray[indexA];
		theArray[indexA] = theArray[indexB];
		theArray[indexB] = temp;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element at index [" + i + "] is " + array[i]);
		}
	}

	public static int binarySearchForValue(int elementToSearch, int[] array) {
		int result = -1;

		int lowIndex = 0;
		int highIndex = array.length - 1;

		while (lowIndex <= highIndex) {

			int middleIndex = (highIndex + lowIndex) / 2;

			if (elementToSearch < array[middleIndex]) {
				highIndex = middleIndex - 1;
			} else if (elementToSearch > array[middleIndex]) {
				lowIndex = middleIndex + 1;
			} else {
				result = middleIndex;
				lowIndex = highIndex + 1;
			}
		}

		return result;
	}

	public static int[] insertInArray(int numberToInsert, int[] array){
		int[] result = new int[array.length + 1];
		System.arraycopy(array, 0, result, 0, array.length );
		result[result.length - 1] = numberToInsert;
		return result;
	}
	
	public static int[] deleteInArray(int indexToDelete, int[] array){
		for(int i = indexToDelete; i < array.length -1 ; i++){
			array[i] = array[i+1];
		}
		
		array[array.length - 1] = -1;
		
		return array;
	}
	
	public static int[] selectionSort(int[] array){
		for(int i = 0; i < array.length; i++){
			int minimumValue = i;
			
			for(int j = i; j < array.length; j++){
				if(array[j] < array[minimumValue]){
					minimumValue = j;
				}
			}
			
			swap(array, i, minimumValue);
			
		}
		
		return array;
	}
	
	public static int[] insertionSort(int[] array){
		
		for(int i = 1; i < array.length; i++){
		
			int j = i;
			
			while(j > 0 && (array[j-1] > array[j])){
				swap(array, j, j - 1);
				j--;
			}
		
		}
		
		return array;
		
	}
}
