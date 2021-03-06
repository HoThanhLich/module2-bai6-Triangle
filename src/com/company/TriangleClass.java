package com.company;

public class TriangleClass extends Shape {
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    public TriangleClass() {

    }

    public TriangleClass(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleClass(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public String toString() {
        return String.format("color: %5s, \t type: %10s, \t area: %.2f, \t perimeter: %.2f.",super.getColor(),(super.isFilled()? " and filled" : " and not filled"),getArea(),getPerimeter());
    }
}
