package doituonghinhhoc;

public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        setColor("green");
        setFilled(true);
    }
    public Shape(String color,boolean filled){
        setColor(color);
        setFilled(filled);
    }
    public void toString(String color,boolean filled){
        if (filled){
        System.out.printf("A Shape with color of %s and filled",color);
    }
        else System.out.printf("A Shape with color of %s and not filled",color);
    }
}
