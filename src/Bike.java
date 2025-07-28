public class Bike implements Vehicle {
    private String numberPlate;
    private String engineType;
    private String brand;
    private boolean hasKickStart;

    public Bike(String numberPlate, String engineType, String brand, boolean hasKickStart) {
        this.numberPlate = numberPlate;
        this.engineType = engineType;
        this.brand = brand;
        this.hasKickStart = hasKickStart;
    }

    @Override
    public String toString() {
        return "Description:\n" +
                "Company: " + brand + "\n" +
                "EngineType: " + engineType + "\n" +
                "Number plate: " + numberPlate + "\n" +
                "Kick Start: " + (hasKickStart ? "Yes" : "No");
    }
}
