package Logic;

public class ArraySearch {
    public static double[] row_min(double myArray[][])
    {
        int rows = myArray.length;
        double[] min_rows = new double[rows];
        for(int i=0;i<rows;i++)
        {
            min_rows[i] = myArray[i][0];
        }
        for(int i = 0; i < min_rows.length; i++){
            for(int j = 0; j < myArray[0].length; j++){
                if(myArray[i][j] < min_rows[i]){
                    min_rows[i] = myArray[i][j];
                }
            }
        }
        return min_rows;
    }
    public static double[] col_max(double myArray[][])
    {
        int cols = myArray[0].length;
        double[] max_cols = new double[cols];
        for(int i=0;i<cols;i++) {
            max_cols[i] = myArray[0][i];
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                if (myArray[i][j] > max_cols[j]) {
                    max_cols[j] = myArray[i][j];
                }
            }
        }
        return max_cols;

    }
}
