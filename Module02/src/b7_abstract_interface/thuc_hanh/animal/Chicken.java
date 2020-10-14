package b7_abstract_interface.thuc_hanh.animal;

import b7_abstract_interface.thuc_hanh.fruit.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
