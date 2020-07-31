package Task4;

class Plane extends Vehicle implements Flyable, Driveable{

    private String name;
    private String color;

    public Plane(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Plane(String name) {

        this.name = name;
    }

    public void fly(){

    }
    public void drive() {

    }
}