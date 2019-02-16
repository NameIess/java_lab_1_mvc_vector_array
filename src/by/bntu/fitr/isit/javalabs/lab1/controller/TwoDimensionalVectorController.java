package by.bntu.fitr.isit.javalabs.lab1.controller;

import by.bntu.fitr.isit.javalabs.lab1.model.TwoDimensionalVector;
import by.bntu.fitr.isit.javalabs.lab1.service.TwoDimensionalVectorService;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateTwoDimensialVectorView;

public class TwoDimensionalVectorController {

    private TwoDimensionalVectorService twoDimensionalVectorService;

    public TwoDimensionalVectorController(TwoDimensionalVectorService twoDimensionalVectorService) {
        this.twoDimensionalVectorService = twoDimensionalVectorService;
    }

    public TwoDimensionalVector createTwoDimensionalVector(CreateTwoDimensialVectorView createTwoDimensialVectorView) {
        return twoDimensionalVectorService.createTwoDimensionalVector(createTwoDimensialVectorView);
    }

    public TwoDimensionalVector sortVector(TwoDimensionalVector twoDimensionalVector) {
        return twoDimensionalVectorService.sortVector(twoDimensionalVector);
    }

}
