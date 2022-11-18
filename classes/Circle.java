package classes;

public class Circle extends Shape{
    protected double radius;
    
    public Circle(double radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    
    public Circle(double radius) {
        this(radius,"white",true);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }
    
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public String toString() {
        return ("Radius: " + radius + " Color: " + color + " Filled: " + filled);
    }
    
}
