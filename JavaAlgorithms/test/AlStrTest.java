
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hamilton.matos
 */
public class AlStrTest {

    private int[] theArray;

    public AlStrTest() {
    }

    @Before
    public void setUp() {
        theArray = new int[]{10, 0, 2, 3, 5, 7, 9, 5, 8, 2, 0, 6};
    }

    /**
     * Test of linearSearchForValue method, of class AlStr.
     */
    @Test
    public void testLinearSearchForValue() {
        int theValue = 0;
        String expResult = "1 10";
        String result = AlStr.linearSearchForValue(theValue, theArray);
        assertEquals(expResult, result);

    }

    /**
     * Test of bubbleSort method, of class AlStr.
     */
    @Test
    public void testBubbleSort() {
        AlStr.bubbleSort(theArray);

        int[] expecteds = {0, 0, 2, 2, 3, 5, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(expecteds, theArray);

        setUp();
    }

    /**
     * Test of binarySearchForValue method, of class AlStr.
     */
    @Test
    public void testBinarySearchForValue() {

        int elementToSearch = 3;

        int expResult = 4;

        Arrays.sort(theArray);

        int result = AlStr.binarySearchForValue(elementToSearch, theArray);
        assertEquals(expResult, result);

        setUp();
    }

    /**
     * Test of insertInArray method, of class AlStr.
     */
    @Test
    public void testInsertInArray() {

        int numberToInsert = 3;

        int[] expResult = new int[]{10, 0, 2, 3, 5, 7, 9, 5, 8, 2, 0, 6, 3};

        int[] result = AlStr.insertInArray(numberToInsert, theArray);

        assertArrayEquals(expResult, result);

        setUp();
    }

    /**
     * Test of deleteInArray method, of class AlStr.
     */
    @Test
    public void testDeleteInArray() {

        int indexToDelete = 5;

        int[] expResult = new int[]{10, 0, 2, 3, 5, 9, 5, 8, 2, 0, 6, -1};

        int[] result = AlStr.deleteInArray(indexToDelete, theArray);

        assertArrayEquals(expResult, result);

        setUp();
    }

    /**
     * Test of selectionSort method, of class AlStr.
     */
    @Test
    public void testSelectionSort() {

        int[] sortedByJava = new int[theArray.length];
        System.arraycopy(theArray, 0, sortedByJava, 0, theArray.length);
        Arrays.sort(sortedByJava);

        int[] expResult = sortedByJava;

        int[] result = AlStr.selectionSort(theArray);

        assertArrayEquals(expResult, result);

        setUp();
    }

    /**
     * Test of insertionSort method, of class AlStr.
     */
    @Test
    public void testInsertionSort() {

        int[] sortedByJava = new int[theArray.length];
        System.arraycopy(theArray, 0, sortedByJava, 0, theArray.length);
        Arrays.sort(sortedByJava);

        int[] expResult = sortedByJava;

        int[] result = AlStr.insertionSort(theArray);

        assertArrayEquals(expResult, result);

        setUp();

    }

}
