package Curs9Tema;

public class CommercialProject extends Project {
	private long marketingFunds;
    private int numberOfTeams;
    private String deadline;
    
    public CommercialProject(String title, String objective, long[] funds, Manager manager, long marketingFunds, int numberOfTeams, String deadline) {
        super(title, objective, funds, manager);
        this.marketingFunds = marketingFunds;
        this.numberOfTeams = numberOfTeams;
        this.deadline = deadline;
    }
}
