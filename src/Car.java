public class Car implements Vehicle{
    private String numberPlate;
    private String engineType;
    private String brand;
    private int noOfGears;
    public Car(String numberPlate, String engineType, String brand, int noOfGears){
        this.numberPlate = numberPlate;
        this.engineType = engineType;
        this.brand = brand;
        this.noOfGears = noOfGears;
    }
    @Override
    public String toString() {
        return "Description:\n" +
                "Company: " + brand + "\n" +
                "EngineType: " + engineType + "\n" +
                "Number plate: " + numberPlate + "\n" +
                "No of Gears: " + noOfGears;
    }
}
