package com.company;

public class task_4 {

    public static void main(String[] args) {
        Car car = new Car("Автомобиль", "Внедорожник");
        Bike bike = new Bike("Велосипед", "Горный");
        Train train = new Train("Поезд", "Товарный");
        Plane plane = new Plane("Самолет", "Пассажирский");
        Boat boat = new Boat("Лодка", "Яхта");
        System.out.println(car.vehicle + " - " + car.car);
        System.out.println(bike.vehicle + " - " + bike.bike);
        System.out.println(train.vehicle + " - " + train.train);
        System.out.println(plane.vehicle + " - " + plane.plane);
        System.out.println(boat.vehicle + " - " + boat.boat + "\n");
        car.drive();
        bike.ride();
        train.drive();
        plane.fly();
        boat.swim();
    }

    static class Vehicle {
        String vehicle;
        Vehicle (String vehicle) {
            this.vehicle = vehicle;
        }
    }

    static class Car extends Vehicle implements Driveable{
        String car;
        Car(String vehicle, String car) {
            super(vehicle);
            this.car = car;
        }
        public void drive(){
            System.out.println("Интерфейс Driveable - " + this.car);
        }
    }

    static class Bike extends Vehicle implements Rideable {
        String bike;
        Bike(String vehicle, String bike) {
            super(vehicle);
            this.bike = bike;
        }
        public void ride(){
            System.out.println("Интерфейс Rideable - " + this.bike);
        }
    }

    static class Train extends Vehicle implements Driveable{
        String train;
        Train(String vehicle, String train) {
            super(vehicle);
            this.train = train;
        }
        public void drive(){
            System.out.println("Интерфейс Driveable - " + this.train);
        }
    }

    static class Plane extends Vehicle implements Flyable{
        String plane;
        Plane(String vehicle, String plane) {
            super(vehicle);
            this.plane = plane;
        }
        public void fly(){
            System.out.println("Интерфейс Flyable - " + this.plane);
        }
    }

    static class Boat extends Vehicle implements Swimable{
        String boat;
        Boat(String vehicle, String boat) {
            super(vehicle);
            this.boat = boat;
        }
        public void swim(){
            System.out.println("Интерфейс Flyable - " + this.boat);
        }
    }

    public interface Driveable {
        void drive();
    }

    public interface Swimable {
        void swim();
    }

    public interface Rideable {
        void ride();
    }

    public interface Flyable {
        void fly();
    }
}
