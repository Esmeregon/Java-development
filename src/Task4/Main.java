package Task4;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Автомобиль");
        Bike bike = new Bike("Велосипед");
        Plane plane = new Plane("Самолет", "Пассажирский");
        car.getCar();
        bike.setBike("Горный");
        System.out.println(car.vehicle + " - " + car.getCar());
        System.out.println(bike.vehicle + " - " + bike.getBike());
        System.out.println(plane.vehicle + " - " + plane.plane);
        bike.ride();
        bike.drive();
    }
}
