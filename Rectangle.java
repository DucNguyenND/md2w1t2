public class Rectangle {
    double weight,height;
    public Rectangle(double weight,double height){
        this.weight=weight;
        this.height=height;
    }
    public double getArea(){
        return weight*height;
    }
    public double getPerimeter(){
        return (2*(weight+height));
    }
    public void display(){
        System.out.println("Chu vi: "+ getPerimeter());
        System.out.println("Dien tich : "+ getArea());
    }
}
