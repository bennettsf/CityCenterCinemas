public class Main {
    public static void main(String[] args){

        MovieClub[] clubs = new MovieClub[5];

        clubs[0] = new PlatinumPlusClub(10.00);
        clubs[1] = new GoldClub(24.00);
        clubs[2] = new SeniorClub(17.00);
        clubs[3] = new PlatinumClub(14.00);
        clubs[4] = new GoldClub(13.75);

        for (MovieClub club : clubs){
            System.out.println(club.toSting() + "\n");
        }

    }
}
