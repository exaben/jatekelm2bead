package printer;

public class PrintArray {
    public static void print2DArray(double myArray[][])
    {
        System.out.println("Matrix:");
        for (int i = 0; i <myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printArray(double array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
