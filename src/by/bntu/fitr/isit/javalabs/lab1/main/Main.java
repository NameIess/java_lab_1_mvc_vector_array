package by.bntu.fitr.isit.javalabs.lab1.main;

import by.bntu.fitr.isit.javalabs.lab1.controller.TwoDimensionalVectorController;
import by.bntu.fitr.isit.javalabs.lab1.controller.VectorController;
import by.bntu.fitr.isit.javalabs.lab1.model.TwoDimensionalVector;
import by.bntu.fitr.isit.javalabs.lab1.model.Vector;
import by.bntu.fitr.isit.javalabs.lab1.repository.TwoDimensialVectorRepository;
import by.bntu.fitr.isit.javalabs.lab1.repository.TwoDimensionalVectorRepositoryImpl;
import by.bntu.fitr.isit.javalabs.lab1.repository.VectorRepository;
import by.bntu.fitr.isit.javalabs.lab1.repository.VectorRepositoryImpl;
import by.bntu.fitr.isit.javalabs.lab1.service.TwoDimensionalVectorService;
import by.bntu.fitr.isit.javalabs.lab1.service.TwoDimensionalVectorServiceImpl;
import by.bntu.fitr.isit.javalabs.lab1.service.VectorService;
import by.bntu.fitr.isit.javalabs.lab1.service.VectorServiceImpl;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateTwoDimensialVectorView;
import by.bntu.fitr.isit.javalabs.lab1.view.CreateVectorView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        VectorRepository vectorRepository = new VectorRepositoryImpl(vector);
        VectorService vectorService = new VectorServiceImpl(vectorRepository);
        VectorController vectorController = new VectorController(vectorService);

        TwoDimensionalVector twoDimensionalVector = new TwoDimensionalVector();
        TwoDimensialVectorRepository twoDimensialVectorRepository = new TwoDimensionalVectorRepositoryImpl(twoDimensionalVector);
        TwoDimensionalVectorService twoDimensionalVectorService = new TwoDimensionalVectorServiceImpl(twoDimensialVectorRepository);
        TwoDimensionalVectorController twoDimensionalVectorController = new TwoDimensionalVectorController(twoDimensionalVectorService);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("press any key");
            String enteredValue = scanner.next();
            while (!enteredValue.equals("exit") ) {
                printMenu();
                enteredValue = scanner.next();
                if (enteredValue.equals("1")){
                    CreateVectorView createVectorView = new CreateVectorView();
                    System.out.println(" Enter vector size");
                    int size = scanner.nextInt();
                    createVectorView.setSize(size);
                    System.out.println(" Enter from value");
                    int from = scanner.nextInt();
                    createVectorView.setFrom(from);
                    System.out.println(" to value");
                    int to = scanner.nextInt();
                    createVectorView.setTo(to);
                    Vector createdVector = vectorController.createVector(createVectorView);
                    System.out.println("Created vector :" + createdVector);
                } else if (enteredValue.equals("2")) {
                    int minIndex = vectorController.getMinElementIndex();
                    System.out.println("min element index :" + minIndex);
                } else if (enteredValue.equals("3")) {
                    double sum = vectorController.getSumBetweenFirstAndSecondNegative();
                    System.out.println("sum :" + sum);
                } else if (enteredValue.equals("4")) {
                    System.out.println("exit");
                    break;
                } else if(enteredValue.equals("5")) {
                    CreateTwoDimensialVectorView createTwoDimensialVectorView = new CreateTwoDimensialVectorView();
                    System.out.println(" Enter columns amount");
                    int columnsAmount = scanner.nextInt();
                    createTwoDimensialVectorView.setColumns(columnsAmount);
                    System.out.println(" Enter rows amount");
                    int rowsAmount = scanner.nextInt();
                    createTwoDimensialVectorView.setRows(rowsAmount);
                    System.out.println(" Enter from value");
                    int from = scanner.nextInt();
                    createTwoDimensialVectorView.setFrom(from);
                    System.out.println(" to value");
                    int to = scanner.nextInt();
                    createTwoDimensialVectorView.setTo(to);
                    TwoDimensionalVector createdTwoDimensionalVector = twoDimensionalVectorController.createTwoDimensionalVector(createTwoDimensialVectorView);
                    System.out.println(createdTwoDimensionalVector);
                } else if(enteredValue.equals("6")) {
                    TwoDimensionalVector sortedVector = twoDimensionalVectorController.sortVector(twoDimensionalVector);
                    System.out.println(sortedVector);
                }
            }
        }

    }

    private static void printMenu() {
        System.out.println(" Menu\n 1. Create vector\n 2. Get min element index\n 3. Get sum between first and second negative values\n 4. Exit\n 5. Create two-dimensial vector \n 6. sort vector");
    }
}
