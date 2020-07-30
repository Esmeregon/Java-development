package Task4;

class Bike extends Vehicle implements Rideable, Driveable {
    String bike;
    Bike(String vehicle, String bike) {
        super(vehicle);
        this.bike = bike;
    }
    public void ride(){System.out.println("Интерфейс Rideable - " + this.bike);}
    public void drive() {System.out.println("Интерфейс Driveable - " + this.bike);}
}