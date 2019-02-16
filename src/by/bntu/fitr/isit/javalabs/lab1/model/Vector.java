package by.bntu.fitr.isit.javalabs.lab1.model;

import java.util.Arrays;

public class Vector {

    private double[] numbers = new double[]{};

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(numbers, vector.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
