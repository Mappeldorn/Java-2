import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    private Driver max;
    private NormalCar normalCar;
    private Trip trip1;
    private Trip trip2;

    @BeforeEach
    void setup() {
        max = new Driver("max");
        normalCar = new NormalCar(Brand.VOLVO, max, "111-aa-1");
        trip1 = new Trip(10, normalCar);
        trip2 = new Trip(29, normalCar);

    }

    @Test
    void tripPrice() {
        assertEquals(5, trip1.calculatePrice(), "price is not correct");
        assertEquals(14.5, trip2.calculatePrice(), "price is not correct");
    }
}