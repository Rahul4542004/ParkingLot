import java.util.*;
public class Floor {
    private List<Spot> spotList;
    private final int floorNumber;
    private final int max_capacity;
    private int available = 0;

    public Floor(int floorNumber, int max_capacity) {
        this.floorNumber = floorNumber;
        this.max_capacity = max_capacity;
        this.spotList = new ArrayList<>();
    }

    private boolean hasCapacity() {
        return spotList.size() < max_capacity;
    }

    public void addSpot(Spot spot) {
        if (!hasCapacity()) {
            System.out.println("This floor doesn't have space left");
            return;
        }
        spotList.add(spot);
    }

    public void addVehicle(Vehicle vehicle, Date startTime) {
        for (Spot spot : spotList) {
            if (spot.getVehicle() == null) {
                spot.setVehicle(vehicle);
                spot.setStartTime(startTime);
                System.out.println("Vehicle added at floorNo - " + this.floorNumber + ", spot - " + spot.getId());
                available++;
                return;
            }
        }
        System.out.println("This floor is filled, remove vehicles to add new ones");
    }

    public Ticket remove(Vehicle vehicle, Date endTime) {
        for (Spot spot : spotList) {
            if (spot.getVehicle() != null && spot.getVehicle().equals(vehicle)) {
                System.out.println("Vehicle removed from spot - " + spot.getId());
                Ticket ticket = new Ticket(spot.getVehicle(), this.floorNumber, endTime, spot.getStartTime(), spot.getId());
                ticket.calculateBasedOnStrategy();
                available--;
                spot.setVehicle(null);
                return ticket;
            }
        }
        return null;
    }

    public boolean hasAvailableSpot(){
        return available < max_capacity;
    }
    public int getFloorNumber(){
        return floorNumber;
    }
    public List<Spot> getAvailableSpots(){
        List<Spot> result = new ArrayList<>();
        for(Spot spot : spotList){
            if(spot.getVehicle() == null){
                result.add(spot);
            }
        }
        return result;
    }
}
