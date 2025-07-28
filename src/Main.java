import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // floor 1 has 2 spots, floor 2 has 4 spots, floor 3 has 1 spot
        List<Integer> capacities = Arrays.asList(2, 4, 1);
        List<List<Spot>> spots = new ArrayList<>();
        spots.add(Arrays.asList(new Spot(101),new Spot(102)));
        spots.add(Arrays.asList(new Spot(205), new Spot(206), new Spot(207), new Spot(208)));
        spots.add(List.of(new Spot(301)));
        ParkingLot parkingLot = new ParkingLot(capacities, spots);

        Vehicle car = new Car("TS01", "Petrol", "Tata", 5);
        Vehicle bike = new Bike("AP02", "Petrol", "Honda", true);
        Vehicle car2 = new Car("TS02", "Diesel", "Toyota", 6);

        Date startDate1 = Date.from(LocalDateTime.of(2023, 6, 15, 10, 30).atZone(ZoneId.systemDefault()).toInstant());
        Date startDate2 = Date.from(LocalDateTime.of(2023, 6, 15, 12, 30).atZone(ZoneId.systemDefault()).toInstant());
        Date startDate3 = Date.from(LocalDateTime.of(2023, 6, 15, 14, 30).atZone(ZoneId.systemDefault()).toInstant());


        parkingLot.parkVehicle(car, startDate1);
        parkingLot.parkVehicle(bike, startDate2);
        parkingLot.parkVehicle(car2, startDate3);

        parkingLot.displayAvailableSpots();
        System.out.println();

        Date endDate1 = Date.from(LocalDateTime.of(2023, 6, 15, 11, 30).atZone(ZoneId.systemDefault()).toInstant());
        Date endDate2 = Date.from(LocalDateTime.of(2023, 6, 15, 15, 30).atZone(ZoneId.systemDefault()).toInstant());
        Date endDate3 = Date.from(LocalDateTime.of(2023, 6, 15, 14, 50).atZone(ZoneId.systemDefault()).toInstant());

        parkingLot.unParkVehicle(car, endDate1);
        parkingLot.unParkVehicle(bike, endDate2);
        System.out.println();
        parkingLot.printTicketHistory();
        System.out.println();
        parkingLot.displayAvailableSpots();
        System.out.println();
        parkingLot.unParkVehicle(car2, endDate3);
        parkingLot.printTicketHistory();
    }
}
