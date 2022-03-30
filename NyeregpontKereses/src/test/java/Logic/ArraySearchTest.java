package Logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Logic.ArraySearch.col_max;
import static Logic.ArraySearch.row_min;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraySearchTest {
    @Test
    void emptyArrayIsNotAcceptedArgumentMin() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            row_min(new double[][]{{}});
        });
    }
    @Test
    void nullArrayIsNotAcceptedArgumentMin() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            row_min(null);
        });
    }
    @Test
    void nullArrayIsNotAcceptedArgumentMax() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            col_max(null);
        });
    }
    @Test
    public void MinTest() {
        assertArrayEquals(row_min(new double[][]{{5,6,7,8},{1,2,3,4}}),new double[]{5,1});
    }
    @Test
    public void MinTestOne() {
        assertArrayEquals(row_min(new double[][]{{5,6,7,8}}),new double[]{5});
    }
    @Test
    public void MaxTestOne() {
        assertArrayEquals(col_max(new double[][]{{5,6,7,8}}),new double[]{5,6,7,8});
    }
    @Test
    public void MaxTest() {
        assertArrayEquals(col_max(new double[][]{{5,6,7,8},{1,2,3,4}}),new double[]{5,6,7,8});
    }
    @Test
    public void AllNegMinTest() {
        assertArrayEquals(row_min(new double[][]{{-5,-6,-7,-8},{-1,-2,-3,-4}}),new double[]{-8,-4});
    }
    @Test
    public void AllNegMaxTest() {
        assertArrayEquals(col_max(new double[][]{{-5,-6,-7,-8},{-1,-2,-3,-4}}),new double[]{-1,-2,-3,-4});
    }
    @Test
    public void MixNegMinTest() {
        assertArrayEquals(row_min(new double[][]{{-5,6,-7,8},{-1,-2,3,-4}}),new double[]{-7,-4});
    }
    @Test
    public void MixNegMaxTest() {
        assertArrayEquals(col_max(new double[][]{{-5,6,-7,8},{-1,-2,3,-4}}),new double[]{-1,6,3,8});
    }
}
