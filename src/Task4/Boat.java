package Task4;

class Boat extends Vehicle implements Swimable, Driveable{
    String boat;
    Boat(String vehicle, String boat) {
        super(vehicle);
        this.boat = boat;
    }
    public void swim(){
        System.out.println("Интерфейс Flyable - " + this.boat);
    }
    public void drive() {System.out.println("Интерфейс Driveable - " + this.boat); }
}