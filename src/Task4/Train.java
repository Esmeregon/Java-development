package Task4;

class Train extends Vehicle implements Driveable, Rideable{
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

    public Train(String name) {

        this.name = name;
    }

    public void drive(){

    }

    @Override
    public void ride() {

    }
}