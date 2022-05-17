package AbstractAndInterface;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
       return  "ec ec";
    }

    @Override
    public String howtoEat() {
        return "an duoc";
    }
}
