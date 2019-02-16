package by.bntu.fitr.isit.javalabs.lab1.repository;

import by.bntu.fitr.isit.javalabs.lab1.model.TwoDimensionalVector;

public class TwoDimensionalVectorRepositoryImpl implements TwoDimensialVectorRepository {

    private TwoDimensionalVector twoDimensionalVector;

    public TwoDimensionalVectorRepositoryImpl(TwoDimensionalVector twoDimensionalVector) {
        this.twoDimensionalVector = twoDimensionalVector;
    }

    @Override
    public TwoDimensionalVector getVector() {
        return twoDimensionalVector;
    }

    @Override
    public TwoDimensionalVector setVector(TwoDimensionalVector twoDimensionalVector) {
        this.twoDimensionalVector = twoDimensionalVector;
        return twoDimensionalVector;
    }
}
