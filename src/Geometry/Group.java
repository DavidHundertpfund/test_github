package Geometry;

 
import java.util.ArrayList;

import java.util.List;
 
class Group {

    private List<Shape> shapes;
 
    public Group() {

        shapes = new ArrayList<>();

    }

/*
 * Adds a Shape
 */
    public void addShape(Shape shape) {
        shapes.add(shape);

    }
 
/*
 * Removes a Shape
 */
    public void removeShape(Shape shape) {
        shapes.remove(shape);

    }
 
   
/*
 * calculates the total Area of a Shape
 */
    public double calculateTotalArea() {

        double totalArea = 0.0;

        for (Shape shape : shapes) {

            totalArea += shape.calculateArea();

        }

        return totalArea;

    }
 
    
/*
 * calculates the total circumference of shape
 */
    public double calculateTotalCircumference() {

        double totalCircumference = 0.0;

        for (Shape shape : shapes) {

            totalCircumference += shape.calculateCircumference();

        }

        return totalCircumference;

    }
 
    
/*
 * searches for the largest Shape
 */
    public Shape findLargestShape() {

        if (shapes.isEmpty()) {

            return null;

        }
 
        Shape largestShape = shapes.get(0);

        double largestArea = largestShape.calculateArea();
 
        for (Shape shape : shapes) {

            double area = shape.calculateArea();

            if (area > largestArea) {

                largestArea = area;

                largestShape = shape;

            }

        }
 
        return largestShape;

    }
 

/*
 * prints all Shapes
 */
    public void printAllShapes() {

        for (Shape shape : shapes) {

            System.out.println("Shape Type: " + shape.getClass().getSimpleName());

            System.out.println("Position: (" + shape.x + ", " + shape.y + ")");

            System.out.println("Area: " + shape.calculateArea());

            System.out.println("Circumference: " + shape.calculateCircumference());

            System.out.println();

        }

    }

}