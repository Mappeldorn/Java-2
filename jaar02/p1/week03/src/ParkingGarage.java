import java.util.HashSet;

public class ParkingGarage {

    private String streetName;
    private HashSet<Row> rows;

    public ParkingGarage(String streetName) {
        this.streetName = streetName;
        this.rows = new HashSet<Row>();
    }
}
