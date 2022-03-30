import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import static Logic.ArraySearch.*;
import static Logic.MinMaxSearch.*;
import static printer.PrintArray.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        Scanner reader = new Scanner(inFile);
        reader.useLocale(Locale.US);
        int cols = 0;
        String[] length = reader.nextLine().trim().split(" ");
        for (int i = 0; i < length.length; i++) {
            cols++;
        }
        reader.close();
        reader = new Scanner(inFile);
        reader.useLocale(Locale.US);
        int count = 0;
        double num1;
        double num2;
        while (reader.hasNextDouble()) {
            num1 = reader.nextDouble();
            count++;
            if (!reader.hasNextDouble()) {
                break;
            }
            num2 = reader.nextDouble();
            count++;
        }
        reader.close();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(inFile)));
        int rows = count / cols;
        double[][] myArray = new double[rows][cols];
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Double.parseDouble(line[j]);
                }
            }
        }
        sc.close();
        print2DArray(myArray);
        double[] min_rows = row_min(myArray);
        double[] max_cols = col_max(myArray);
        double min= min_search(max_cols);
        double max= max_search(min_rows);
        int ri = findIndex(min_rows,max);
        int cj = findIndex(max_cols,min);
        System.out.println("Sorminimum:");
        printArray(min_rows);
        System.out.println("Min:" + min);
        System.out.println("Oszlopmaximum:");
        printArray(max_cols);
        System.out.println("Max:" + max);
        if(max == min) {
            System.out.println("A jateknak van nyeregpontja, ha a sorjatekos a " + ri + " strategiajat valasztja, az oszlopjatekos pedig a " + cj + " strategiajat jatssza.");
        }
        else {
            System.out.println("A jateknak nincs nyeregpontja!");
        }
    }
}

