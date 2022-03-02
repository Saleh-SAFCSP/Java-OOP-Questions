package com.company.question1;

public class MyRectangle {

    private  double height;
    private  double width;
    private double area;
    private  double perimeter;

    public MyRectangle(double height, double width, double area, double perimeter) {
        this.height = height;
        this.width = width;
        this.area = height*width;
        this.perimeter = 2*(width+height);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
