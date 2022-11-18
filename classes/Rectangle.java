package classes;
public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle(double width,double lenght) {
        this(width,lenght,"white",true);
    }

    public Rectangle(double width,double lenght,String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return (this.lenght * this.width);
    }
    
    public double getPerimeter() {
        return (2 * this.lenght + 2 * this.width);
    }
    public String toString() {
        return ("Width: " + width + " Lenght:"+ lenght + " Color: " + color + " Filled: " + filled);
    }
}
