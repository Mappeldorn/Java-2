import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RowTest {

    private Row rowA = new Row('A');
    private Car blueAudi;
    private Car blackAudi;

    @BeforeEach
    void setUp() {

        blueAudi = new Car("27-JV-NV", "blue");
        blackAudi = new Car("24-NVB-1", "black");

        rowA.parkCar(blueAudi);
        rowA.parkCar(blackAudi);
    }



    @Test
    void parkCar() {

        assertEquals("Occupied", rowA.getParkingSpotStauts(1), "failed");
        assertEquals("Occupied", rowA.getParkingSpotStauts(2), "failed");
        assertEquals("Free", rowA.getParkingSpotStauts(3), "failed");

    }


    @Test
    void removeCarByLicensePlate() {

        assertEquals("Occupied", rowA.getParkingSpotStauts(1), "failed");
        rowA.removeCarByLicensePlate("27-JV-NV");
        assertEquals("Free", rowA.getParkingSpotStauts(1), "failed");
        assertEquals("Occupied", rowA.getParkingSpotStauts(2), "failed");

    }
}