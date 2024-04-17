package StrategyPattern;
// Youtube link for reference: https://www.youtube.com/watch?v=u8DttUrXtEw&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=4
// Idea: The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. 
// Strategy lets the algorithm vary independently from clients that use it.

public class Main {
    public static void main(String []args) {
        System.out.println("Hello World!");

        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new OffroadVehicle();
        vehicle3.drive();

        Vehicle vehicle4 = new CargoVehicle();
        vehicle4.drive();

        Vehicle vehicle5 = new GoodsVehicle();
        vehicle5.drive();
    }
}