package by.bntu.fitr.isit.javalabs.lab1.service;

import by.bntu.fitr.isit.javalabs.lab1.model.TwoDimensionalVector;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateTwoDimensialVectorView;

public interface TwoDimensionalVectorService {

    TwoDimensionalVector createTwoDimensionalVector(CreateTwoDimensialVectorView createTwoDimensialVectorView);
    TwoDimensionalVector sortVector(TwoDimensionalVector twoDimensionalVector);

}
