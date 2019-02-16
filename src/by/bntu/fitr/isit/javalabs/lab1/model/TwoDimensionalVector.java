package by.bntu.fitr.isit.javalabs.lab1.model;

import java.util.Arrays;

public class TwoDimensionalVector {

    private double[][] twoDimensionalVector = new double[][]{};

    public double[][] getTwoDimensionalVector() {
        return twoDimensionalVector;
    }

    public void setTwoDimensionalVector(double[][] twoDimensionalVector) {
        this.twoDimensionalVector = twoDimensionalVector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoDimensionalVector that = (TwoDimensionalVector) o;
        return Arrays.equals(twoDimensionalVector, that.twoDimensionalVector);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(twoDimensionalVector);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < twoDimensionalVector.length; i++) {
            for (int j = 0; j < twoDimensionalVector.length; j++) {
                stringBuilder.append(twoDimensionalVector[i][j]).append("\t");
            }
            stringBuilder.append("\n");
        }

        return "TwoDimensionalVector{" +
                "twoDimensionalVector= \n" + stringBuilder.toString() +
                '}';
    }
}
