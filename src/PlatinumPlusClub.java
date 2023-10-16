public class PlatinumPlusClub extends PlatinumClub{

    public PlatinumPlusClub(Double ticketPrice) {
        super(ticketPrice);
    }

    public Double getYearlyClubFee(){
        return 40.00;
    }

    @Override
    public int getFreePassesPerMonth() {
        return super.getFreePassesPerMonth() + 2;
    }
}
