// public class ShallowcopyDeepcopy {
// Deep Copy Example
// Address Class
// class Address {
// String city;

// Address(String city) {
// this.city = city;
// }
// }
// Student Class
// class Student {
// String name;
// Address address;

// Student(String name, Address address) {
// this.name = name;
// this.address = address;
// }

// // Deep Copy Constructor
// Student(Student s) {

// this.name = s.name;

// // NEW Address object created
// this.address = new Address(s.address.city);
// }
// }

// Shallow Copy Example
// Address Class
// class Address {
// String city;

// Address(String city) {
// this.city = city;
// }
// }
// Student Class
// class Student {
// String name;
// Address address;

// Student(String name, Address address) {
// this.name = name;
// this.address = address;
// }

// // Shallow Copy Constructor
// Student(Student s) {
// this.name = s.name;

// // SAME reference copied
// this.address = s.address;
// }
// }
// }
