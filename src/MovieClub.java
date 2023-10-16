public class MovieClub {

    private Double ticketPrice;

    public MovieClub(Double ticketPrice){
        setTicketPrice(ticketPrice);
    }

    public Double getTicketPrice(){
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        if (ticketPrice < 0){
            throw new IllegalArgumentException("Ticket price must not be negative.");
        }

        this.ticketPrice = ticketPrice;
    }

    public String getBenefits(){
        return "Online ticketing. ";
    }

    public String toSting(){

        return "Class: " + this.getClass().getSimpleName() +
                ", Ticket Price: " + Double.parseDouble(String.format("%2f",getTicketPrice())) +
                ", Club Benefits: " + getBenefits();
    }
}
