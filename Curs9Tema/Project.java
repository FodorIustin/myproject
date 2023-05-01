package Curs9Tema;

import java.util.ArrayList;

public class Project implements Risky {
    private String title;
    private String objective;
    private long[] funds;
    private Manager manager;
    private ArrayList<Programmer> programmers;
    
    public Project(String title, String objective, long[] funds, Manager manager) {
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.manager = manager;
        this.programmers = new ArrayList<>();
    }
    
    
}