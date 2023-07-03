package ss07_abstract_class_and_interface.thuchanh.lop_animal_va_interface;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cục tác cục tác ";
    }

    @Override
    public String howToEat() {
        return "Eat rice";
    }
}
