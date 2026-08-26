abstract class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void sound();
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sound();
    }
}