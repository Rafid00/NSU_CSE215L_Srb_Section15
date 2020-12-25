package com.company;

import java.time.YearMonth;

public class FrontEndDev extends BackEndDev {
    //calling the variables
    private String working_since;
    private String project_name;
    private int team_members;
    private String team_leader;


    public FrontEndDev(String name, int id, double salary, String email,
                       String working_since, boolean scrum_master,
                       int team_members, String team_leader) { //creating the constructor
        super(name, id, salary, email, working_since, scrum_master);
        this.working_since = working_since;
        this.team_leader = team_leader;
    }

    //getters and setters
    //overriding some methods from BackEndDev

    @Override
    public String getWorking_since() {
        return working_since;
    }

    @Override
    public void setWorking_since(String working_since) {
        this.working_since = working_since;
    }

    @Override
    public String getProject_name() {
        return project_name;
    }

    @Override
    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    @Override
    public int getTeam_members() {
        return team_members;
    }

    @Override
    public void setTeam_members(int team_members) {
        this.team_members = team_members;
    }

    public String getTeam_leader() {
        return team_leader;
    }

    public void setTeam_leader(String team_leader) {
        this.team_leader = team_leader;
    }

    public void printEmploymentYears(String working_since) { //will print the employment years
        int year = YearMonth.now().getYear(); //this method returns the current year
        int working_since_copy = Integer.parseInt(working_since); //parsing to Integer from String
        System.out.println("Employment year: " + (year - working_since_copy)); //calculating employment year
    }

    public void assignProject(String project_name, int team_members, String front_end_framework) {
        this.project_name = project_name;
        this.team_members = team_members;
    }

    public void printAssignedProject() {
        System.out.println("project name: " + this.project_name + "\nnumber of team members: "
                + this.team_members + "\nteam leader: " + this.team_leader + "\nworking since: "
                + this.working_since);
    }
}
