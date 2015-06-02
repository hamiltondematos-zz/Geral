
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class AlgsTest {

    private int[] arrayToTest;
    private Algs algs;

    public AlgsTest() {
        arrayToTest = new int[]{2, 3, 5, 6, 7, 8, 10, 1, 0, 4};
        algs = new Algs();

        resetArray();
    }

    private void resetArray() {
        algs.generateRandomArray(10);
    }

    @Test
    public void testBubbleSort() {

        int[] expectedResult = new int[arrayToTest.length];
        System.arraycopy(arrayToTest, 0, expectedResult, 0, arrayToTest.length);
        Arrays.sort(expectedResult);

        algs.bubbleSort(arrayToTest);

        Assert.assertArrayEquals(expectedResult, arrayToTest);

        resetArray();

    }

    @Test
    public void testInsertionSort() {

        int[] expectedSortedArray = new int[arrayToTest.length];
        System.arraycopy(arrayToTest, 0, expectedSortedArray, 0, arrayToTest.length);
        Arrays.sort(expectedSortedArray);

        algs.insertionSort(arrayToTest);

        Assert.assertArrayEquals(expectedSortedArray, arrayToTest);

        resetArray();
    }

    @Test
    public void testSelectionSort() {

        int[] expectedSortedArray = new int[arrayToTest.length];
        System.arraycopy(arrayToTest, 0, expectedSortedArray, 0, arrayToTest.length);
        Arrays.sort(expectedSortedArray);

        algs.selectionSort(arrayToTest);

        Assert.assertArrayEquals(expectedSortedArray, arrayToTest);

        resetArray();

    }

    @Test
    public void testLinearSearch() {

        Arrays.sort(arrayToTest);
        int indexExpected = Arrays.binarySearch(arrayToTest, 5);

        int indexFound = algs.linearSearch(arrayToTest, 5);

        Assert.assertEquals(indexExpected, indexFound);

        resetArray();
    }

    @Test
    public void testDeleteElementAtIndex() {
        int indexToRemove = arrayToTest.length - 1;

        int[] expectedResult = new int[arrayToTest.length];
        System.arraycopy(arrayToTest, 0, expectedResult, 0, arrayToTest.length);
        expectedResult[arrayToTest.length - 1] = -1;

        algs.deleteElementAtIndex(indexToRemove, arrayToTest);

        Assert.assertArrayEquals(expectedResult, arrayToTest);

    }

    @Test
    public void testReverseString() {

        String wordToReverse = "this is the statement to be reversed";

        String expectedResult = new StringBuilder(wordToReverse).reverse().toString();//"arvalap";

        String result = algs.reverse(wordToReverse);
        //System.out.println("Reversed " + result);

        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void testWordCount() {

        String word = "Syntactically this is the word";

        int expectedNumberOfOccurrences = 4;

        int result = algs.searchForNumberOfOccurrences("t", word);
        int result2 = algs.searchForNumberOfOccurrences2("t", word);

        Assert.assertEquals(expectedNumberOfOccurrences, result);
        Assert.assertEquals(expectedNumberOfOccurrences, result2);
    }

    @Test
    public void testCountAllLetters(){
        String word = "this is the word to test"; // 5 t's
        int countExpected = 5;
        int countProcessed = algs.countAllLetters(word)['t'];
        Assert.assertEquals(countExpected, countProcessed);
        
    }
    
}
