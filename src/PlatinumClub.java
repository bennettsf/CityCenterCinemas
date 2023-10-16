public class PlatinumClub extends MovieClub {
    public PlatinumClub(Double ticketPrice) {
        super(ticketPrice);
    }

    @Override
    public Double getTicketPrice() {
        return super.getTicketPrice() * 0.80;
    }

    public int getFreePassesPerMonth(){
        return 1;
    }

    public Double getYearlyClubFee(){
        return 30.00;
    }

    public String getBenefits(){
        return super.getBenefits() + "Free soda and popcorn refill, buddy passes.";
    }
}
