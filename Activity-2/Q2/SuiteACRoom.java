public class SuiteACRoom extends HotelRoom{

    private Integer ratePerSqFeet;

    public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 15;
    }

    public Integer getRatePerSqFeet() {
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
