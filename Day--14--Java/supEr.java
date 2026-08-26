// import java.lang.reflect.Constructor;
// import java.lang.reflect.Method;

// public class supEr {
//     4. super Variable

// Used to access parent class variable.

// Example
// class Animal {

//     String color = "White";
// }

// class Dog extends Animal {

//     String color = "Black";

//     void printColor() {

//         System.out.println(super.color);

//         System.out.println(color);
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.printColor();
//     }
// }

// Output:

// White
// Black
// Explanation
// super.color

// means:

// parent class variable

// while:

// color

// means child variable.

// 5. super Method

// Used to call parent class method.

// Example
// class Animal {

//     void sound() {

//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {

//     void sound() {

//         System.out.println("Dog barks");
//     }

//     void display() {

//         super.sound();

//         sound();
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.display();
//     }
// }

// Output:

// Animal sound
// Dog barks
// Why super.method() Needed?

// Because child method overrides parent method.

// To call parent version:

// super.method()

// used.

// 6. super Constructor

// Used to call parent constructor.

// Syntax
// super();
// Example
// class Animal {

//     Animal() {

//         System.out.println("Animal Constructor");
//     }
// }

// class Dog extends Animal {

//     Dog() {

//         super();

//         System.out.println("Dog Constructor");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Dog d = new Dog();
//     }
// }

// Output:

// Animal Constructor
// Dog Constructor
// }
