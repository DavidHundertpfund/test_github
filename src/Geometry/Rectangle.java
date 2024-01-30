package Geometry;
 
class Rectangle extends Shape {
    private double length;
    private double width;
 
    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }
 
    /*
     * calculates Area of the Rectangle
     */
    double calculateArea() {
        return length * width;
    }
 
    /*
     * calculates Circumference of the Rectangle
     */
    double calculateCircumference() {
        return 2 * (length + width);
    }
}
 

