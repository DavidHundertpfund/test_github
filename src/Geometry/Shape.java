package Geometry;
	
	abstract class Shape {
	    protected double x;
	    protected double y;
	 
	    public Shape(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	 
	    
	    abstract double calculateArea();
	 
	   
	    abstract double calculateCircumference();
	}
	 

	

