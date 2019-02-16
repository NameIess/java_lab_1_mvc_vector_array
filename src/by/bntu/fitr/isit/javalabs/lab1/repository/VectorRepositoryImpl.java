package by.bntu.fitr.isit.javalabs.lab1.repository;

import by.bntu.fitr.isit.javalabs.lab1.model.Vector;

public class VectorRepositoryImpl implements VectorRepository {

    private Vector vector;

    public VectorRepositoryImpl(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Vector getVector() {
        return vector;
    }

    @Override
    public Vector setVector(Vector vector) {
        this.vector = vector;
        return vector;
    }
}
