public class HotelRoom {

    protected String hotelName;
    protected Integer numberOfSqFeet;
    protected Boolean hasTV;
    protected Boolean hasWifi;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getNumberOfSqFeet() {
        return numberOfSqFeet;
    }

    public void setNumberOfSqFeet(Integer numberOfSqFeet) {
        this.numberOfSqFeet = numberOfSqFeet;
    }

    public Boolean getHasTV() {
        return hasTV;
    }

    public void setHasTV(Boolean hasTV) {
        this.hasTV = hasTV;
    }

    public Boolean getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(Boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }
    public int calculateTariff(){
        return 0;
    }

    public int ratePerSqFeet(){
        return 0;
    }
}
