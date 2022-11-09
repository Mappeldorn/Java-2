public class NormalCar extends Car {
    //price price per kilometer in cents
    private final int PRICE_PKM = 50;

    public NormalCar(Brand brand, Driver driver, String licensePlate) {
        super(brand, driver, licensePlate);

    }

    //Getter
    public int getPRICE_PKM() {
        return PRICE_PKM;
    }
}
