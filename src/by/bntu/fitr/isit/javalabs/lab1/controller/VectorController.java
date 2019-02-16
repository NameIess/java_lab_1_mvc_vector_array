package by.bntu.fitr.isit.javalabs.lab1.controller;

import by.bntu.fitr.isit.javalabs.lab1.model.Vector;
import by.bntu.fitr.isit.javalabs.lab1.service.VectorService;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateVectorView;

public class VectorController {
    private VectorService vectorService;

    public VectorController(VectorService vectorService) {
        this.vectorService = vectorService;
    }

    public Vector createVector(CreateVectorView createVectorView) {
        return vectorService.createVector(createVectorView);
    }

    public int getMinElementIndex() {
        return vectorService.getMinElementIndex();
    }

    public double getSumBetweenFirstAndSecondNegative() {
        return vectorService.getSumBetweenFirstAndSecondNegative();
    }


}
