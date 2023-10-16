public class SeniorClub extends MovieClub{

    public SeniorClub(Double ticketPrice) {
        super(ticketPrice);
    }

    @Override
    public Double getTicketPrice() {
        return super.getTicketPrice() * 0.50;
    }

    public int getFreePassesPerMonth(){
        return 0;
    }

    public Double getYearlyClubFee(){
        return 5.00;
    }

    public String getBenefits(){
        return super.getBenefits() + "Free child-sized popcorn & soda.";
    }

}
