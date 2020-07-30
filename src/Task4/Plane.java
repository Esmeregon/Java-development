package Task4;

class Plane extends Vehicle implements Flyable, Driveable{
    String plane;
    Plane(String vehicle, String plane) {
        super(vehicle);
        this.plane = plane;
    }
    public void fly(){System.out.println("Интерфейс Flyable - " + this.plane);}
    public void drive() {System.out.println("Интерфейс Driveable - " + this.plane);}
}