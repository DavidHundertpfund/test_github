package Geometry;



class Circle extends Shape {
   private double radius;

   public Circle(double x, double y, double radius) {
       super(x, y);
       this.radius = radius;
   }

   @Override
   /*
    * calculates Area of the Circle
    */
   double calculateArea() {
       return Math.PI * Math.pow(radius, 2);
   }

   @Override
   /*
    * calculates Circumference of the Circle
    */
   double calculateCircumference() {
       return 2 * Math.PI * radius;
   }
}



