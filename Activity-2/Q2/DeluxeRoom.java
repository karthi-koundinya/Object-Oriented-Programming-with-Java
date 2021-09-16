public class DeluxeRoom extends HotelRoom{

    private Integer ratePerSqFeet;

    public Integer getRatePerSqFeet() {
        return ratePerSqFeet;
    }

    public void setRatePerSqFeet(Integer ratePerSqFeet) {
        this.ratePerSqFeet = ratePerSqFeet;
    }

    public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 10;
    }

    @Override
    public int ratePerSqFeet() {
        if (super.getHasWifi().equals(true)){
            return ratePerSqFeet+2;
        } else {
            return ratePerSqFeet;
        }
    }

    @Override
    public int calculateTariff() {
        return ratePerSqFeet * super.getNumberOfSqFeet();
    }
}
