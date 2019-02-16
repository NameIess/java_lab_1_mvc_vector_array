package by.bntu.fitr.isit.javalabs.lab1.model;

import java.util.List;

public class Column implements Comparable<Column> {
    private double sumOfElements;
    private List<Double> elements;

    public Column(double sumOfElements, List<Double> elements) {
        this.sumOfElements = sumOfElements;
        this.elements = elements;
    }

    public double getSumOfElements() {
        return sumOfElements;
    }

    public void setSumOfElements(double sumOfElements) {
        this.sumOfElements = sumOfElements;
    }

    public List<Double> getElements() {
        return elements;
    }

    public void setElements(List<Double> elements) {
        this.elements = elements;
    }

    @Override
    public int compareTo(Column o) {
        return (int) (this.sumOfElements - o.getSumOfElements());
    }

    @Override
    public String toString() {
        return "Column{" +
                "sumOfElements=" + sumOfElements +
                ", elements=" + elements +
                '}';
    }
}
