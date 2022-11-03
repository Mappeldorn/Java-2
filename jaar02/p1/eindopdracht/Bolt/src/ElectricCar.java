public class ElectricCar extends Car {
    //price price per kilometer in cents
    private final int PRICE_PKM = 25;

    public ElectricCar(Brand brand, Driver driver, String licensePlate) {
        super(brand, driver, licensePlate);
    }

    //Getter
    public int getPRICE_PKM() {
        return PRICE_PKM;
    }
}
