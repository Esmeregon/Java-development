package Task4;

class Car extends Vehicle implements Driveable{

    String car;

    Car(String vehicle) {
        super(vehicle);
    }

    public String getCar() {
        return "Седан";
    }

    public void drive() { System.out.println("Интерфейс Driveable (Bike) - " + this.car);
    }
}