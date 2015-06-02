
public class Algs {

    private int[] theArray;

    public void generateRandomArray(int numberOfElements) {

        theArray = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            theArray[i] = (int) (Math.random() * 10) + 1;
        }

    }

    public int[] bubbleSort(int[] theArrayToSort) {
        for (int i = theArrayToSort.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (theArrayToSort[i] < theArrayToSort[j]) {
                    swap(i, j, theArrayToSort);
                }

            }

        }

        return theArrayToSort;
    }

    public void swap(int indexA, int indexB, int[] theArray) {
        int temp = theArray[indexA];
        theArray[indexA] = theArray[indexB];
        theArray[indexB] = temp;
    }

    public int[] insertionSort(int[] arrayToSort) {

        for (int i = 1; i < arrayToSort.length; i++) {

            int j = i;

            while (j > 0 && arrayToSort[j] < arrayToSort[j - 1]) {
                swap(j, j - 1, arrayToSort);
                j--;
            }

        }

        return arrayToSort;

    }

    public void selectionSort(int[] theArrayToSort) {

        for (int i = 0; i < theArrayToSort.length; i++) {

            int minimumValue = i;

            for (int j = i; j < theArrayToSort.length; j++) {
                if (theArrayToSort[j] < theArrayToSort[minimumValue]) {
                    minimumValue = j;
                }
            }

            swap(i, minimumValue, theArrayToSort);
        }

    }

    public int linearSearch(int[] arrayToTest, int numberToFind) {

        for (int i = 0; i < arrayToTest.length; i++) {
            if (arrayToTest[i] == numberToFind) {
                return i;
            }
        }

        return -1;
    }

    public void deleteElementAtIndex(int indexToRemove, int[] array) {
        if (indexToRemove > array.length) {
            return;
        }

        for (int i = indexToRemove; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = -1;
    }

    public String reverse(String word) {
        char[] wordArray = word.toCharArray();

        for (int i = 0, j = wordArray.length - 1; i < wordArray.length / 2; i++, j--) {
            swap(i, j, wordArray);
        }

        return String.valueOf(wordArray);
    }

    public void swap(int indexA, int indexB, char[] theArray) {
        char temp = theArray[indexA];
        theArray[indexA] = theArray[indexB];
        theArray[indexB] = temp;
    }

    public int searchForNumberOfOccurrences(String letterToSearc, String word) {
        int result = 0;

        char[] charArray = word.toCharArray();
        char letterToSearch = letterToSearc.toCharArray()[0];

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == letterToSearch) {
                result++;
            }
        }

        return result;
    }

    public int searchForNumberOfOccurrences2(String letterToSearc, String word) {

        return word.length() - word.replace(letterToSearc, "").length();
    }

    public int[] countAllLetters(String w) {

        char[] charArray = w.toCharArray();

        int[] count = new int[Character.MAX_VALUE];

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            count[c]++;
        }

        return count;

    }
}
