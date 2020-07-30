package Task4;

class Car extends Vehicle implements Driveable{
    String car;
    Car(String vehicle, String car) {
        super(vehicle);
        this.car = car;
    }
    public void drive(){
        System.out.println("Интерфейс Driveable - " + this.car);
    }
}