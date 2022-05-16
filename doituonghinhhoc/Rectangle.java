package doituonghinhhoc;

public class Rectangle extends Circle{
    private double width,lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle() {
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
    public double getArea(double width,double lenght){
        double s=width*lenght;
        return s;
    }
    public double getPerimeter(double width,double lenght){
        double c=2*(width+lenght);
        return c;
        }
    }
