class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class Hierarchical {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}