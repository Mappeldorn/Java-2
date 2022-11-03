public class Trip {
    private int distance;
    private Car car;


    public Trip(int distance, Car car) {
        if (distance < 0) {
            throw new NullPointerException("Distance cant be below 0");
        }
        this.distance = distance;
        this.car = car;
        this.car.addRevenue(calculatePrice());
        this.car.addDistance(distance);
    }

    public void price(){
        this.car.getPRICE_PKM();
    }

    /**
     * Calculates price of the trip
     *
     * @return double, price in euro's
     */
    public double calculatePrice() {
        double price = 0.0;
        if (this.car instanceof DieselCar) {
            price = this.distance * ((DieselCar) this.car).getPRICE_PKM();
            price += ((DieselCar) this.car).getENVIRONMENTAL_SUBCHARGE() * (double) (this.distance / ((DieselCar) this.car).getDISTANCE_UNTIL_SUBCHARGE());
        } else if (this.car instanceof NormalCar) {
            price = this.distance * ((NormalCar) this.car).getPRICE_PKM();
        } else if (this.car instanceof ElectricCar) {
            price = this.distance * ((ElectricCar) this.car).getPRICE_PKM();
        }

        return Math.round((price / 100) * 100.0) / 100.0;
    }

    //Getters & setters
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
