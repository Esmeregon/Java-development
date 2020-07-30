package Task4;

class Bike extends Vehicle implements Rideable, Driveable {
    String bike;

    Bike(String vehicle) {
        super(vehicle);
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getBike() {
        return bike;
    }

    public void ride(){System.out.println("Интерфейс Rideable (Bike) - " + this.bike);}
    public void drive() {System.out.println("Интерфейс Driveable (Bike) - " + this.bike);}

}