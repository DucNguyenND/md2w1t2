package CircleCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getCylinder() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(double radius){
     double s=Math.PI*Math.pow(radius,2);
     return s;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
