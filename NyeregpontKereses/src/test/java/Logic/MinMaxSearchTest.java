package Logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Logic.MinMaxSearch.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxSearchTest {
    @Test
    void emptyArrayIsNotAcceptedArgumentMin() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            min_search(new double[]{});
        });
    }
    @Test
    void emptyArrayIsNotAcceptedArgumentMax() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            max_search(new double[]{});
        });
    }
    @Test
    void nullArrayIsNotAcceptedArgumentMin() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            min_search(null);
        });
    }
    @Test
    void nullArrayIsNotAcceptedArgumentMax() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            max_search(null);
        });
    }
    @Test
    public void MinTestOne() {
        assertEquals(min_search(new double[]{5}),5);
    }
    @Test
    public void MaxTestOne() {
        assertEquals(max_search(new double[]{5}),5);
    }
    @Test
    public void lastValueIsSmallest() { assertEquals(min_search(new double[]{5.0,11.5,3.3}),3.3);
    }
    @Test
    public void lastValueIsLargest() {
        assertEquals(max_search(new double[]{5.0,11.5,22.1}),22.1);
    }
    @Test
    public void MinTest() {
        assertEquals(min_search(new double[]{5,11,3,6,8}),3);
    }
    @Test
    public void AllNegMinTest() {
        assertEquals(min_search(new double[]{-5,-11,-3,-6,-8}),-11);
    }
    @Test
    public void MaxTest() {
        assertEquals(max_search(new double[]{5,11,3,6,8}),11);
    }
    @Test
    public void AllNegMaxTest() {
        assertEquals(max_search(new double[]{-5,-11,-3,-6,-8}),-3);
    }
    @Test
    public void FirstValueIsSmallest() {
        assertEquals(min_search(new double[]{1.25,11.5,3.3}),1.25);
    }
    @Test
    public void FirstValueIsLargest() {
        assertEquals(max_search(new double[]{55.0,11.5,22.1}),55.0);
    }
    @Test
    public void indexSearchTest() {
        assertEquals(findIndex(new double[]{55.0,11.5,22.1},11.5),1);
    }
    @Test
    public void indexSearchTest2() {
        assertEquals(findIndex(new double[]{55.0,11.5,22},22),2);
    }

}
