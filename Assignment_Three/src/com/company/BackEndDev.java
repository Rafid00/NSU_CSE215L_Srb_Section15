package com.company;

import java.time.YearMonth;

public class BackEndDev extends DBA {
    //calling the variables
    private String working_since;
    private String project_name;
    private int team_members;
    private boolean scrum_master;

    public BackEndDev(String name, int id, double salary, String email,
                      String working_since, boolean scrum_master) { //creating the constructor
        super(name, id, salary, email, working_since);
        this.working_since = working_since;
        this.scrum_master = scrum_master;
    }

    //getters and setters
    //overriding some methods from DBA

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

    public boolean isScrum_master() {
        return scrum_master;
    }

    public void setScrum_master(boolean scrum_master) {
        this.scrum_master = scrum_master;
    }

    public void printEmploymentYears(String working_since) { //will print the employment years
        int year = YearMonth.now().getYear(); //this method returns the current year
        int working_since_copy = Integer.parseInt(working_since); //parsing to Integer from String
        System.out.println("Employment year: " + (year - working_since_copy)); //calculating employment year
    }

    public void assignProject(String project_name, int team_members, String server_side_framework) { //this works alike constructor
        this.project_name = project_name;
        this.team_members = team_members;
    }

    public void printAssignedProject() { //will print the project details
        System.out.println("project name: " + this.project_name + "\nnumber of team members: "
                + this.team_members + "\nis scrum master: " + this.scrum_master + "\nworking since: "
                + this.working_since);
    }
}
