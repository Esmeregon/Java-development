package Task4;

public class Main {

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
}
