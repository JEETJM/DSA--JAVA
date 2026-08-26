interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog barks");
    }
}

public class InterfacES {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}


















// 13. Multiple Inheritance Using Interface
// interface A {

//     void show();
// }

// interface B {

//     void display();
// }

// class Test implements A, B {

//     public void show() {
//         System.out.println("Show");
//     }

//     public void display() {
//         System.out.println("Display");
//     }
// }