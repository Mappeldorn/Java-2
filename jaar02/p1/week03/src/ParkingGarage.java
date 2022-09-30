import java.util.ArrayList;
import java.util.HashSet;

public class ParkingGarage {

    private String address;
    private String asphaltColor;
    private ArrayList<Floor> floors;

    private final static int MAX_AMOUNT_OF_ROWS = 24;

    public ParkingGarage( String address, String asphaltColor) {
        this.address = address;
        this.asphaltColor = asphaltColor;
        this.floors = new ArrayList<Floor>();
    }

    public String getParkingSpotStatus(int floorLevel, char rowId, int index){
        for (Floor floor : this.floors) {
            if (floor.getLevel() == floorLevel) {
                for (Row row : floor.getRows()){
                    if (row.getId() == rowId) return row.getParkingSpotStauts(index);
                }
            }
        }
        return "Does not exist!";
    }

    public void removeCarByLicensePlate(String licensePlate){
        for (Floor floor : this.floors) {
            for (Row row : floor.getRows()){
                row.searchAndRemoveCarByLicensePlate(licensePlate);
            }
        }
    }

    public void parkCar(int floorLevel, char rowId, Car car){
        for (Floor floor : this.floors) {
            if (floor.getLevel() == floorLevel) {
                for (Row row : floor.getRows()){
                    if (row.getId() == rowId) row.parkCar(car); return;
                }
            }
        }
    }

    public void addRowToFloor(int floorLevel, Row row){
        for (Floor floor : this.floors) {
            if(floor.getLevel() == floorLevel) floor.addRow(row); return;
        }
    }

    public void addFloor(){
        this.floors.add(new Floor(this.floors.size()));
    }

    //Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAsphaltColor() {
        return asphaltColor;
    }

    public void setAsphaltColor(String asphaltColor) {
        this.asphaltColor = asphaltColor;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }
}
