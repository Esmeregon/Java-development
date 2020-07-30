package Task4;

class Train extends Vehicle implements Driveable{
    String train;
    Train(String vehicle, String train) {
        super(vehicle);
        this.train = train;
    }
    public void drive(){
        System.out.println("Интерфейс Driveable (Train) - " + this.train);
    }
}