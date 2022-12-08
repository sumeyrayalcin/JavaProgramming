package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");
        dog.eat();
        dog.bark();
        dog.drink();
        dog.move();
        dog.sleep();
        System.out.println(dog);

        // dog.hunt();
        //dog.sctatch();

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();


        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);
    }

}
