package Logic;

public class MinMaxSearch {
    public static double min_search(double [] array)
    {
        double min = array[0];
        for(int i=0; i<array.length; i++)
        {
            if(min > array[i]){
                min = array[i]  ;
            }
        }
        return min;
    }
    public static double max_search(double [] array)
    {
        double max = array[0];
        for(int i=0; i<array.length; i++)
        {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static int findIndex(double[] arr, double t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
