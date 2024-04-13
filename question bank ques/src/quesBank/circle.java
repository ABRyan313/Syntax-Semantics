package quesBank;

public class circle {
	
	private double radius;
	
	public circle(int radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		
		return radius;
		
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
				
	}

}
