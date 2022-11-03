import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Bolt {
    private ArrayList<Trip> trips;

    public Bolt() {
        this.trips = new ArrayList<>();
    }

    /**
     * Gets the driver with most total revenue
     *
     * @return Driver, driver with most revenue
     */
    public Driver getDriverWithMostRevenue() {
        Driver mostRevenueDriver = null;
        double revenue = 0;
        HashSet<Car> cars = new HashSet<Car>();

        for (Trip trip : this.trips) {
            cars.add(trip.getCar());
        }

        for (Car car : cars) {
            if (mostRevenueDriver == null) {
                mostRevenueDriver = car.getDriver();
                revenue = car.getTotalRevenue();
            } else if (car.getTotalRevenue() > revenue) {
                mostRevenueDriver = car.getDriver();
                revenue = car.getTotalRevenue();
            }
        }
        return mostRevenueDriver;
    }

    /**
     * Gets trip with the longest distance
     *
     * @return Trip, the longest trip
     */
    public Trip getLongestTrip() {
        Trip longestTrip = null;
        for (Trip trip : this.trips) {
            if (longestTrip == null) {
                longestTrip = trip;
            } else if (trip.getDistance() >= longestTrip.getDistance()) {
                longestTrip = trip;
            }
        }

        return longestTrip;
    }

    /**
     * Gets de average distance from all driven trips
     *
     * @return double, average distance
     */
    public double getAverageDistance() {
        HashSet<Car> cars = new HashSet<Car>();
        int totalDistance = 0;
        if (!this.trips.isEmpty()) {

            for (Trip trip : this.trips) {
                cars.add(trip.getCar());
            }

            for (Car car : cars) {
                totalDistance += car.getTotalDistance();
            }
            return Math.round(((double) totalDistance / cars.size()) * 100.0) / 100.0;
        }

        return 0;
    }

    /**
     * Gets the total revenue from all the trips
     *
     * @return double, total revenue
     */
    public double getTotalRevenue() {

        double revenue = 0.0;

        for (Trip trip : this.trips) {
            revenue += trip.getCar().getTotalRevenue();
        }

        return revenue;
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    //Getters & setters
    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }
}
