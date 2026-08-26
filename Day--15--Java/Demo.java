// class Demo {

//     static void fun() {

//         System.out.println("Hello");

//         fun();
//     }

//     public static void main(String[] args) {

//         fun();
//     }

// }

class Demo {

    static void fun1() {

        System.out.println("Inside fun1");

        fun2();
    }

    static void fun2() {

        System.out.println("Inside fun2");
    }

    public static void main(String[] args) {

        System.out.println("Start");

        fun1();

        System.out.println("End");
    }
}