import java.util.Objects;

public class Row {

    private char id;
    private Car[] parkedCars;
    private final static int MAX_AMOUNT_OF_PARKING_SPACE = 23;

    public Row(char id) {
        this.id = id;
        this.parkedCars = new Car[MAX_AMOUNT_OF_PARKING_SPACE];
    }


    public void parkCar(Car car){
        int availableParkingSpot = this.getNextAvailableParkingSpot();
        if (availableParkingSpot == -1) return;

        this.parkedCars[availableParkingSpot] = car;
    }

    public void removeCarByLicensePlate(String licensePlate){
        for (int i = 0; i < this.parkedCars.length; i++){
            if(this.parkedCars[i] != null) {
                if(Objects.equals(this.parkedCars[i].getLicensePlate(), licensePlate)){
                    this.parkedCars[i] = null;
                }
            }
        }
    }

    public String getParkingSpotStauts(int index){
        if(this.parkedCars[index -1] != null) return "Occupied";

        return "Free";

    }

    public int getNextAvailableParkingSpot(){
        for (int i = 0; i < this.parkedCars.length; i++){
            if (this.parkedCars[i] == null){
                return i;
            }
        }
        return -1;
    }

}
