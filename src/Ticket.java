import java.util.*;
public class Ticket {
    private Vehicle vehicle;
    private int floorNumber;
    private long totalCost;
    private Date endTime;
    private Date startTime;
    private int spotId;
    public Ticket(Vehicle vehicle, int floorNumber, Date endTime, Date startTime, int spotId) {
        this.vehicle = vehicle;
        this.floorNumber = floorNumber;
        this.endTime = endTime;
        this.startTime = startTime;
        this.spotId = spotId;
    }

    public long calculateBasedOnStrategy(){
        long timeInMillis = endTime.getTime() - startTime.getTime();
        long minutes = (timeInMillis/ (60 * 1000));
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(minutes);
        totalCost = strategy.calculateCost(minutes);
        return totalCost;
    }

    public void generateTicket(){
        System.out.println("Floor Number : " + floorNumber);
        System.out.println("Spot#" + spotId);
        System.out.println(vehicle);
        System.out.println("End time : " + endTime);
        System.out.println("------------------------------------------------");
        System.out.println("Total cost : " + totalCost + "$");

    }
}
