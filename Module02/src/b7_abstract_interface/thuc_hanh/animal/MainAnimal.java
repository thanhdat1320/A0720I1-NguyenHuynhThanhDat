package b7_abstract_interface.thuc_hanh.animal;

import b7_abstract_interface.thuc_hanh.fruit.Edible;

public class MainAnimal {
    public static void main(String[] args) {
       Animal[] animals = new Animal[2];
       animals[0] = new Tiger();
       animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
