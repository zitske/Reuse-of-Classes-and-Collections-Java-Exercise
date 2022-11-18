package classes;
abstract class Shape {
    protected String color;
    protected Boolean filled;
    public Shape(String color,Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return ("Color: " + color + " Filled: " + filled);
    }
}