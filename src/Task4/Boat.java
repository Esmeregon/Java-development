package Task4;

class Boat extends Vehicle implements Swimable, Driveable{
    private String name;
    private String color;

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

    public Boat(String name) {

        this.name = name;
    }

    public void swim(){

    }
    public void drive() {

    }
}