import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoltTest {

    private Bolt bolt;

    private Trip trip1;
    private Trip trip2;
    private Trip trip3;
    private Trip trip4;

    private Driver max;
    private Driver henk;
    private Driver boltDriver;

    private NormalCar normalCar;
    private DieselCar dieselCar;
    private ElectricCar electricCar;

    @BeforeEach
    void setup() {

        bolt = new Bolt();

        max = new Driver("max");
        henk = new Driver("henk");
        boltDriver = new Driver("  ");

        normalCar = new NormalCar(Brand.VOLVO, max, "333-CC-3");
        dieselCar = new DieselCar(Brand.VOLVO, henk, "222-BB-2");
        electricCar = new ElectricCar(Brand.TOYOTA, boltDriver, "111-AA-1");

        trip1 = new Trip(10, normalCar);
        trip2 = new Trip(25, electricCar);
        trip3 = new Trip(32, dieselCar);

    }

    @Test
    void totalRevenue() {
        assertEquals(0, bolt.getTotalRevenue(), "total revenue not correct");
        //Trip1 revenue 5 euro
        bolt.addTrip(trip1);
        assertEquals(5, bolt.getTotalRevenue(), "total revenue not correct");
        //Trip2 revenue 6,25 euro
        bolt.addTrip(trip2);
        assertEquals(11.25, bolt.getTotalRevenue(), "total revenue not correct");
        //Trip3 revenue 29,16 euro
        bolt.addTrip(trip3);
        assertEquals(40.41, bolt.getTotalRevenue(), "total revenue not correct");
    }

    @Test
    void averageDistance() {
        assertEquals(0, bolt.getAverageDistance(), "average distance not correct");
        //Trip1 distance = 10
        bolt.addTrip(trip1);
        assertEquals(10, bolt.getAverageDistance(), "average distance not correct");
        //Trip2 distance = 25
        bolt.addTrip(trip2);
        assertEquals(17.5, bolt.getAverageDistance(), "average distance not correct");
        //Trip3 distance = 32
        bolt.addTrip(trip3);
        assertEquals(22.33, bolt.getAverageDistance(), "average distance not correct");
        trip4 = new Trip(15, normalCar);
        //Trip4 distance = 15
        bolt.addTrip(trip4);
        assertEquals(27.33, bolt.getAverageDistance(), "average distance not correct");
    }

    @Test
    void longestTrip() {
        assertNull(bolt.getLongestTrip(), "longest trip not correct");
        //Trip1 distance = 10
        bolt.addTrip(trip1);
        assertEquals(trip1, bolt.getLongestTrip(), "longest trip not correct");
        //Trip3 distance = 32
        bolt.addTrip(trip3);
        assertEquals(trip3, bolt.getLongestTrip(), "longest trip not correct");
        //Trip2 distance = 25
        bolt.addTrip(trip2);
        assertEquals(trip3, bolt.getLongestTrip(), "longest trip not correct");
        trip4 = new Trip(32, normalCar);
        //Trip4 distance = 32
        bolt.addTrip(trip4);
        assertEquals(trip4, bolt.getLongestTrip(), "longest trip not correct");
    }

    @Test
    void driverWithMostRevenue() {
        assertNull(bolt.getDriverWithMostRevenue(), "driver not correct");
        //trip1 driver = max with 5 euro total revenue
        bolt.addTrip(trip1);
        assertEquals(max, bolt.getDriverWithMostRevenue(), "driver not correct");
        //trip2 driver = boltDriver with 6,25 euro total revenue
        bolt.addTrip(trip2);
        assertEquals(boltDriver, bolt.getDriverWithMostRevenue(), "driver not correct");
        //trip3 driver = henk with 29,16 euro total revenue
        bolt.addTrip(trip3);
        assertEquals(henk, bolt.getDriverWithMostRevenue(), "driver not correct");
        //Trip4 driver = max with 30 euro total revenue
        trip4 = new Trip(50, normalCar);
        assertEquals(max, bolt.getDriverWithMostRevenue(), "driver not correct");
    }
}