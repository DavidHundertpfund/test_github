package Geometry;
 
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
 
    public Triangle(double x, double y, double side1, double side2, double side3) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
 
    @Override
    /*
     * calculates Area of the Triangle
     */
    double calculateArea() {
        
        return 0.0;
    }
 
    @Override
    /*
     * calculates Circumference of the Triangle
     */
    double calculateCircumference() {
        return side1 + side2 + side3;
    }
}
 
