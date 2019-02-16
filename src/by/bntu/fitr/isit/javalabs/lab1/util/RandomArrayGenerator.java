package by.bntu.fitr.isit.javalabs.lab1.util;

import java.util.Random;

public class RandomArrayGenerator {

    private static final Random random = new Random();

    public static double[] ofDouble(int size, int from, int to) {
        double[] randomArray = new double[size];

        for (int i = 0; i < size; i++){
            double randomValue = from + (to - from) * random.nextDouble();
            randomArray[i] = randomValue;
        }

        return randomArray;
    }

    public static double[][] twoDimensionalArray(int columns, int rows, int from, int to) {
        double[][] randomTwoDimensionalArray = new double[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                double randomValue = from + (to - from) * random.nextDouble();
                randomTwoDimensionalArray[i][j] = randomValue;
            }

        return randomTwoDimensionalArray;
    }
}
