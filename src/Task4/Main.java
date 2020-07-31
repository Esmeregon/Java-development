package Task4;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Автомобиль", "Красный");
        Plane plane = new Plane("Самолет");
        car.acceleration();
        car.braking();
        plane.setColor("Желтый");
        System.out.println(plane.getColor());
        System.out.println(plane.getName());
        System.out.println(car.getColor());
    }
}
