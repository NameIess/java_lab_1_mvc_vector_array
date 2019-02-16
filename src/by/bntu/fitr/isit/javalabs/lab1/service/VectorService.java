package by.bntu.fitr.isit.javalabs.lab1.service;

import by.bntu.fitr.isit.javalabs.lab1.model.Vector;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateVectorView;

public interface VectorService {
    Vector createVector(CreateVectorView createVectorView);
    int getMinElementIndex();
    double getSumBetweenFirstAndSecondNegative();

}
