public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed= SLOW;
    private boolean on= false;
    private double radius=5;
    private String color="blue";
    public void Fan(){
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void tostring(){
        if (isOn()){
            System.out.print(" Speed= " + getSpeed());
            System.out.print(" Color= " + getColor());
            System.out.print(" Radius= " + getRadius());
            System.out.println("Fan is on");
        }
        else {
            System.out.print(" Color= " + getColor());
            System.out.print(" Radius= " + getRadius());
            System.out.println("Fan is off");
        }
    }
}
