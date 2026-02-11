public class ClubDriver {
    public static void main(String[] args) {
        Club codingClub = new Club(24, "Coding Club", 1000000);
        Club gutterCleaningClub = new Club(2, "Gutter Cleaning Club ", 5);
        ServiceClub homelessShelterClub = new ServiceClub(10, "Homeless Shelter Club", 1000, "Homless People");
        CompetitiveClub tiddlyWinksClub = new CompetitiveClub(20, "Tidly Winks Club", 100, "PLAY TIDDLY WINKS!!!!!", 10, "USTWF", true);
        Club snowballClub = new CompetitiveClub(20, "Snowball Club", 100, "SNOWBALL!!!!!!!!!!", 10, "USSF", true);

        System.out.println(codingClub.getBudgetAmount());
        System.out.println(gutterCleaningClub.getNumberMembers());
        
        System.out.println(homelessShelterClub.getServiceTargetGroup());
        System.out.println(homelessShelterClub.getBudgetAmount());
        System.out.println(homelessShelterClub.getNumberMembers());
        System.out.println(tiddlyWinksClub.getDescription());
        System.out.println(((CompetitiveClub)snowballClub).getLeagueName());
        System.out.println(snowballClub.giveReport());
    }
}
