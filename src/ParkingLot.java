import java.text.DateFormat;
import java.util.*;
public class ParkingLot {
    private final List<Floor> floors = new ArrayList<>();
    private List<Ticket> ticketHistory = new ArrayList<>();
    public ParkingLot(List<Integer> floorCapacities, List<List<Spot>> spots) {
        for (int i = 0; i < floorCapacities.size(); i++) {
            int floorNumber = i + 1;
            int cap = floorCapacities.get(i);
            Floor floor = new Floor(floorNumber, cap);
            List<Spot> list = spots.get(i);
            for(Spot spot : list){
                floor.addSpot(spot);
            }
            floors.add(floor);
        }
    }

    public void parkVehicle(Vehicle vehicle, Date startTime) {
        for (Floor floor : floors) {
            if (floor.hasAvailableSpot()) {
                floor.addVehicle(vehicle, startTime);
                return;
            }
        }
        System.out.println("No available spots in any floor.");
    }

    public void unParkVehicle(Vehicle vehicle, Date endTime) {
        for (Floor floor : floors) {
            Ticket ticket = floor.remove(vehicle, endTime);
            if (ticket != null) {
                ticketHistory.add(ticket);
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void displayAvailableSpots() {
        System.out.println("Available Spots:");
        for (Floor floor : floors) {
            System.out.print("Floor " + floor.getFloorNumber() + ": ");
            List<Spot> available = floor.getAvailableSpots();
            for (Spot s : available) {
                System.out.print("Spot#" + s.getId() + " ");
            }
            System.out.println();
        }
    }

    public void printTicketHistory(){
        System.out.println("Ticket history : ");
        for(Ticket ticket : ticketHistory){
            System.out.println("========================================================");
            ticket.generateTicket();
        }
    }
}
