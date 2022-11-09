import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private Brand brand;
    private Driver driver;
    private String licensePlate;
    private double totalRevenue;
    private int totalDistance;

    public Car(Brand brand, Driver driver, String licensePlate) {
        this.brand = brand;
        this.driver = driver;
        this.licensePlate = checkLicensePlate(licensePlate);
        this.totalRevenue = 0.0f;
        this.totalDistance = 0;
    }

    /**
     * checks the format of the license plate and replace all incorrect characters
     *
     * @param licensePlate String license plate
     * @return String, license plate
     */
    public String checkLicensePlate(String licensePlate) {
        Pattern pattern = Pattern.compile("\"^[0-9]{3}[-][A-z]{2}[-][0-9]{1}$\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(licensePlate);

        if (matcher.find()) {
            return licensePlate;
        }

        char[] ch = licensePlate.toCharArray();
        String formattedLicensePlate = "";
        for (int i = 0; i < ch.length; i++) {
            if (i < 3) {
                if (!Character.isDigit(ch[i])) {
                    formattedLicensePlate += "-1";
                } else {
                    formattedLicensePlate += ch[i];
                }
            } else if (i > 3 && i < 6) {
                if (!Character.isAlphabetic(ch[i])) {
                    formattedLicensePlate += "null";
                } else {
                    formattedLicensePlate += ch[i];
                }
            } else if (i > 6 && i < 9) {
                if (!Character.isDigit(ch[i])) {
                    formattedLicensePlate += "-1";
                } else {
                    formattedLicensePlate += ch[i];
                }
            } else {
                formattedLicensePlate += ch[i];
            }
        }
        return formattedLicensePlate;
    }

    public void addDistance(int distance) {
        this.totalDistance += distance;
    }

    public void addRevenue(double revenue) {
        this.totalRevenue += revenue;
    }

    //Getters and setters
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }
}