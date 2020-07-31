package Task4;

class Bike extends Vehicle implements Rideable, Driveable {
    private String name;
    private String color;

    public Bike(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Bike(String name) {
        this.name = name;
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

    @Override
    public void drive() {

    }

    @Override
    public void ride() {

    }
}