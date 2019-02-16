package by.bntu.fitr.isit.javalabs.lab1.service;

import by.bntu.fitr.isit.javalabs.lab1.model.Column;
import by.bntu.fitr.isit.javalabs.lab1.model.TwoDimensionalVector;
import by.bntu.fitr.isit.javalabs.lab1.repository.TwoDimensialVectorRepository;
import by.bntu.fitr.isit.javalabs.lab1.util.RandomArrayGenerator;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateTwoDimensialVectorView;

import java.util.*;

public class TwoDimensionalVectorServiceImpl implements TwoDimensionalVectorService {

    private TwoDimensialVectorRepository twoDimensialVectorRepository;

    public TwoDimensionalVectorServiceImpl(TwoDimensialVectorRepository twoDimensialVectorRepository) {
        this.twoDimensialVectorRepository = twoDimensialVectorRepository;
    }

    @Override
    public TwoDimensionalVector createTwoDimensionalVector(CreateTwoDimensialVectorView createTwoDimensialVectorView) {
        TwoDimensionalVector twoDimensionalVector = twoDimensialVectorRepository.getVector();
        twoDimensionalVector.setTwoDimensionalVector(RandomArrayGenerator.twoDimensionalArray(
                createTwoDimensialVectorView.getColumns(),
                createTwoDimensialVectorView.getRows(),
                createTwoDimensialVectorView.getFrom(),
                createTwoDimensialVectorView.getTo())
        );

        return twoDimensionalVector;
    }

    @Override
    public TwoDimensionalVector sortVector(TwoDimensionalVector twoDimensionalVector) {

        double[][] vector = twoDimensionalVector.getTwoDimensionalVector();

        List<Column> arrayColumns = getArrayColumns(vector);
        Collections.sort(arrayColumns);

        double[][] sortedArray = fillArrayWithColumns(arrayColumns);

        twoDimensionalVector.setTwoDimensionalVector(sortedArray);

        return twoDimensionalVector;
    }

    private List<Column> getArrayColumns(double[][] vector) {
        List<Column> arrayColumns = new ArrayList<>();

        for (int columnIndex = 0; columnIndex < vector[0].length; columnIndex++) {
            List<Double> values = new ArrayList<>();
            for (int rowIndex = 0; rowIndex < vector.length; rowIndex++) {
                values.add(vector[rowIndex][columnIndex]);
            }
            arrayColumns.add(new Column(values.stream().mapToDouble(Double::doubleValue).sum(), values));
        }
        return arrayColumns;
    }

    private double[][] fillArrayWithColumns(List<Column> arrayColumns) {

        double[][] sortedArray = new double[arrayColumns.get(0).getElements().size()][arrayColumns.size()];
        for (int j = 0; j < arrayColumns.size(); j++) {
            Column column = arrayColumns.get(j);
            List<Double> elements = column.getElements();
            for (int i = 0; i < elements.size(); i++) {
                sortedArray[i][j] = elements.get(i);
            }
        }
        return sortedArray;
    }

}
