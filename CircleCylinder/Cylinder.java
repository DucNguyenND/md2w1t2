package CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(double radius, double height){
     double v=height*Math.pow(radius,2)*Math.PI;
     return v;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                super.toString()+
                '}';
    }
}
