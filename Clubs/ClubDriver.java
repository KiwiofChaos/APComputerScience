public class ClubDriver {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        Club gutterCleaningClub = new Club(2, "Gutter Cleaning Club ", 5);
        System.out.println("Name: " + gutterCleaningClub.getNameOfClub());
        System.out.println("Number of Members: " + gutterCleaningClub.getNumberMembers());
        System.out.println("Budget: " + gutterCleaningClub.getBudgetAmount());
        System.out.println("**********************************************");
        FunClub codingClub = new FunClub(24, "Coding Club", 1000000, "Learn about coding!", 10);
        System.out.println("Name: " + codingClub.getNameOfClub());
        System.out.println("Description: " + codingClub.getDescription());
        System.out.println("Number of Members: " + codingClub.getNumberMembers());
        System.out.println("Budget: " + codingClub.getBudgetAmount());
        System.out.println("Number of fun events planed: " + codingClub.getNumberFunEventsPlanned());
        System.out.println("**********************************************");
        ServiceClub homelessShelterClub = new ServiceClub(10, "Homeless Shelter Club", 1000, "Homless People");
        System.out.println("Name: " + homelessShelterClub.getNameOfClub());
        System.out.println("Number of Members: " + homelessShelterClub.getNumberMembers());
        System.out.println("Budget: " + homelessShelterClub.getBudgetAmount());
        System.out.println("Target for Service: " + homelessShelterClub.getServiceTargetGroup());
        System.out.println("**********************************************");
        CompetitiveClub tiddlyWinksClub = new CompetitiveClub(20, "Tidly Winks Club", 100, "PLAY TIDDLY WINKS!!!!!", 10, "USTWF", true);
        System.out.println("Name: " + tiddlyWinksClub.getNameOfClub());
        System.out.println("Description: " + tiddlyWinksClub.getDescription());
        System.out.println("Number of Members: " + tiddlyWinksClub.getNumberMembers());
        System.out.println("Budget: " + tiddlyWinksClub.getBudgetAmount());
        System.out.println("Number of fun events planed: " + tiddlyWinksClub.getNumberFunEventsPlanned());
        System.out.println("League: " + tiddlyWinksClub.getLeagueName());
        System.out.println("We have won " + tiddlyWinksClub.getNumberWins() + " times.");
        tiddlyWinksClub.increaseNumberWins();
        System.out.println("Oh, now we have won " + tiddlyWinksClub.getNumberWins() + " times.");
        tiddlyWinksClub.setLeagueName("CANTWF");
        System.out.println("We moved to canada and the league name is now " + tiddlyWinksClub.getLeagueName());
        if (tiddlyWinksClub.getHasPlayoff()) {
            System.out.println("We have a playoff.");
        } else {
            System.out.println("We do not not not have a playoff.");
        }
        System.out.println("**********************************************");
    }
}


//Club snowballClub = new CompetitiveClub(20, "Snowball Club", 100, "SNOWBALL!!!!!!!!!!", 10, "USSF", true);
// System.out.println(codingClub.getBudgetAmount());
// System.out.println(gutterCleaningClub.getNumberMembers());
        
// System.out.println(homelessShelterClub.getServiceTargetGroup());
// System.out.println(homelessShelterClub.getBudgetAmount());
// System.out.println(homelessShelterClub.getNumberMembers());
// System.out.println(tiddlyWinksClub.getDescription());
// System.out.println(((CompetitiveClub)snowballClub).getLeagueName());
// System.out.println(snowballClub.giveReport());