import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Driver boltDriver;
    private Driver max;


    @BeforeEach
    void setup() {
        boltDriver = new Driver("    ");
        max = new Driver("max");
    }

    @Test
    void driverName() {
        assertEquals("BoltDriver", boltDriver.getName(), "name not correct");
        assertEquals("max", max.getName(), "name not correct");
    }
}