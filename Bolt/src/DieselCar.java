public class DieselCar extends Car {
    //price price per kilometer in cents
    private final int PRICE_PKM = 63;
    //price for environmental surcharge for every km
    private final int ENVIRONMENTAL_SUBCHARGE = 300;
    //Distance until environmental surcharge
    private final int DISTANCE_UNTIL_SUBCHARGE = 10;

    public DieselCar(Brand brand, Driver driver, String licensePlate) {
        super(brand, driver, licensePlate);
    }

    //Getters
    public int getPRICE_PKM() {
        return PRICE_PKM;
    }

    public int getENVIRONMENTAL_SUBCHARGE() {
        return ENVIRONMENTAL_SUBCHARGE;
    }

    public int getDISTANCE_UNTIL_SUBCHARGE() {
        return DISTANCE_UNTIL_SUBCHARGE;
    }
}
