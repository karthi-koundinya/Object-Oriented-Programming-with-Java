public class DeluxeACRoom extends DeluxeRoom{

    public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        super.setRatePerSqFeet(12);
    }

    @Override
    public int calculateTariff() {
        return super.calculateTariff();
    }
}
