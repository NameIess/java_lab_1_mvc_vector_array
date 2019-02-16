package by.bntu.fitr.isit.javalabs.lab1.service;

import by.bntu.fitr.isit.javalabs.lab1.model.Vector;
import by.bntu.fitr.isit.javalabs.lab1.repository.VectorRepository;
import by.bntu.fitr.isit.javalabs.lab1.util.RandomArrayGenerator;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateVectorView;

public class VectorServiceImpl implements VectorService {
    private static final int EMPTY_VECTOR_ELEMENT_INDEX = -1;

    private VectorRepository vectorRepository;

    public VectorServiceImpl(VectorRepository vectorRepository) {
        this.vectorRepository = vectorRepository;
    }

    @Override
    public Vector createVector(CreateVectorView createVectorView) {
        Vector vector = vectorRepository.getVector();
        vector.setNumbers(RandomArrayGenerator.ofDouble(
                createVectorView.getSize(),
                createVectorView.getFrom(),
                createVectorView.getTo())
        );

        return vector;
    }

    @Override
    public int getMinElementIndex() {
        Vector vector = vectorRepository.getVector();
        return (vector.getNumbers().length == 0) ? EMPTY_VECTOR_ELEMENT_INDEX : getMinValueIndex(vector);
    }

    @Override
    public double getSumBetweenFirstAndSecondNegative() {
        Vector vector = vectorRepository.getVector();
        return (vector.getNumbers().length == 0) ? EMPTY_VECTOR_ELEMENT_INDEX : getSumBetweenFirstAndSecondNegative(vector);
    }

    private double getSumBetweenFirstAndSecondNegative(Vector vector) {
        double[] numbers =  vector.getNumbers();
        int countNegativesElements = 0;
        double sum = 0.0d;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                countNegativesElements++;
                continue;
            }

            if (countNegativesElements >= 1 && countNegativesElements < 2) {
                sum += numbers[i];
            }
        }

        return sum;
    }

    private int getMinValueIndex(Vector vector) {
        double[] numbers =  vector.getNumbers();
        int minValueIndex = 0;
        double minValue = numbers[minValueIndex];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minValueIndex = i;
            }
        }

        return minValueIndex;
    }
}
