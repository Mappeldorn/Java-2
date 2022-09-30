import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingGarageTest {

    private ParkingGarage parkingGarageEmmen = new ParkingGarage("straat 10", "white");
    private Car blueAudi;
    private Car blackAudi;

    private Row row0A;
    private Row row0B;
    private Row row1A;

    @BeforeEach
    void setUp() {
        blueAudi = new Car("27-JV-NV", "blue");
        blackAudi = new Car("24-NVB-1", "black");
        row0A = new Row('A');
        row0B = new Row('B');
        row1A = new Row('A');
        parkingGarageEmmen.addFloor();
        parkingGarageEmmen.addFloor();
        parkingGarageEmmen.addRowToFloor(0, row0A);
        parkingGarageEmmen.addRowToFloor(0, row0B);
        parkingGarageEmmen.addRowToFloor(1, row1A);

    }

    @Test
    void parkCar() {
        parkingGarageEmmen.parkCar(0,'A',blueAudi);
        parkingGarageEmmen.parkCar(0,'B',blackAudi);

        assertEquals("Occupied", parkingGarageEmmen.getParkingSpotStatus(0, 'A', 1), "failed");
        assertEquals("Occupied", parkingGarageEmmen.getParkingSpotStatus(0, 'B', 2), "failed");
        assertEquals("Free", parkingGarageEmmen.getParkingSpotStatus(1, 'A', 1), "failed");


    }

}