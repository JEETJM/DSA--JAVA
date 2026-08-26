/*
========================================
        OOPS QUESTIONS ALL IN ONE
========================================
*/

import java.util.Scanner;

// ======================================================
// Question 1
// Sum, Difference and Product of Complex Numbers
// ======================================================

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void sum(Complex c1, Complex c2) {
        int r = c1.real + c2.real;
        int i = c1.imag + c2.imag;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(Complex c1, Complex c2) {
        int r = c1.real - c2.real;
        int i = c1.imag - c2.imag;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void product(Complex c1, Complex c2) {
        int r = (c1.real * c2.real) - (c1.imag * c2.imag);
        int i = (c1.real * c2.imag) + (c1.imag * c2.real);

        System.out.println("Product = " + r + " + " + i + "i");
    }
}

// ======================================================
// Question 2
// Output Program
// Correct Answer: Driving electric car
// ======================================================

class Automobile {

    private String drive() {
        return "Driving vehicle";
    }
}

class CarQ2 extends Automobile {

    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends CarQ2 {

    @Override
    public final String drive() {
        return "Driving electric car";
    }
}

// ======================================================
// Question 3
// Correct Answer:
// public and protected both can be used
// ======================================================

class Shape {

    protected void display() {
        System.out.println("Display-base");
    }
}

class Circle extends Shape {

    // protected OR public can be used

    protected void display() {
        System.out.println("Display-derived");
    }
}

// ======================================================
// Question 4
// Output Program
// Output: 13245
// ======================================================

abstract class Car {

    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

class BlueCar extends Car {

    {
        System.out.print("4");
    }

    public BlueCar() {
        super("Blue");
        System.out.print("5");
    }
}

// ======================================================
// Main Class
// ======================================================

public class OOPSQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==========================
        // Question 1
        // ==========================

        System.out.println("===== COMPLEX NUMBER OPERATIONS =====");

        System.out.print("Enter first real part: ");
        int r1 = sc.nextInt();

        System.out.print("Enter first imaginary part: ");
        int i1 = sc.nextInt();

        System.out.print("Enter second real part: ");
        int r2 = sc.nextInt();

        System.out.print("Enter second imaginary part: ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = new Complex(0, 0);

        result.sum(c1, c2);
        result.difference(c1, c2);
        result.product(c1, c2);

        // ==========================
        // Question 2
        // ==========================

        System.out.println("\n===== QUESTION 2 OUTPUT =====");

        final CarQ2 car = new ElectricCar();

        System.out.println(car.drive());

        // ==========================
        // Question 3
        // ==========================

        System.out.println("\n===== QUESTION 3 =====");

        Circle obj = new Circle();
        obj.display();

        System.out.println("Correct Answer: public and protected both can be used");

        // ==========================
        // Question 4
        // ==========================

        System.out.println("\n===== QUESTION 4 OUTPUT =====");

        new BlueCar();

        System.out.println("\nExpected Output: 13245");
    }
}