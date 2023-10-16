public class GoldClub extends MovieClub {
    public GoldClub(Double ticketPrice) {
        super(ticketPrice);
    }

    @Override
    public Double getTicketPrice() {
        return super.getTicketPrice() * 0.90;
    }

    public int getFreePassesPerMonth(){
        return 0;
    }

    public Double getYearlyClubFee(){
        return 15.00;
    }

    public String getBenefits(){
        return super.getBenefits() + "Free soda refill.";
    }
}
