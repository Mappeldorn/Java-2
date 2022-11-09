import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalCarTest {

    private NormalCar normalCar;
    private DieselCar dieselCar;
    private Driver max;

    @BeforeEach
    void setup() {
        max = new Driver("max");
        normalCar = new NormalCar(Brand.VOLVO, max, "11A-a1-2");
        dieselCar = new DieselCar(Brand.TOYOTA, max, "111-Aa-1");
    }

    @Test
    void testLicensePlate() {
        assertEquals("11-1-anull-2", normalCar.getLicensePlate(), "license plate not correct formatted");
        assertEquals("111-Aa-1", dieselCar.getLicensePlate(), "license plate not correct formatted");
    }
}