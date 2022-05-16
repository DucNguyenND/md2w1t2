package doituonghinhhoc;

public class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle() {
        setRadius(1.0);
    }
    public double getArea(double radius){
        double area=Math.PI*Math.pow(radius,2);
        return area;
  }
    public double getPerimeter(double radius){
        double c=2*Math.PI*radius;
        return c;
    }

    @Override
    public void toString(String color, boolean filled) {
        System.out.println("A Circle with radius="+ getRadius()+" which is a subclass of "+super.toString());
    }
}
