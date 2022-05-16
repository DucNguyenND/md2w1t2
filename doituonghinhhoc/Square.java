package doituonghinhhoc;

public class Square extends Rectangle{
    public Square() {
        super.setLenght(1.0);
        super.setWidth(1.0);
    }
    public Square(double side){
        super(side,side);
    }
    public void setSide(){
        getWidth();
    }
    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setLenght(width);
    }

    @Override
    public double getWidth() {
        return super.getLenght();
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
