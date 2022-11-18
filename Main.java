import classes.Circle;
import classes.Rectangle;

public class Main {

    public static void main(String[] args) {
         
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(10,10);
        System.out.println("Data: \n");
        System.out.println(circle1.toString());
        System.out.println("\n"+rectangle1.toString());
        circle1.setRadius(20);
        rectangle1.setLenght(20);
        rectangle1.setWidth(20);
        System.out.println('\n' + "New data: \n");
        System.out.println(circle1.toString()+'\n');
        System.out.println("Area = "+circle1.getArea()+'\n');
        System.out.println("Perimeter = "+circle1.getPerimeter()+'\n');
        System.out.println("\n"+rectangle1.toString()+'\n');
        System.out.println("Area = "+rectangle1.getArea()+'\n');
        System.out.println("Perimeter = "+rectangle1.getPerimeter()+'\n');
      }
    
}
