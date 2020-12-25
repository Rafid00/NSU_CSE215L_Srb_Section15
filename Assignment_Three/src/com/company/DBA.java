package com.company;

import java.time.YearMonth;

public class DBA extends Employees {
    //calling the variables
    private String working_since;
    private String project_name;
    private int team_members;
    private String query_language;

    public DBA(String name, int id, double salary, String email, String working_since) { //creating the constructor
        super(name, id, salary, email);
        this.working_since = working_since;
    }

    //getters and setters
    public String getWorking_since() {
        return working_since;
    }

    public void setWorking_since(String working_since) {
        this.working_since = working_since;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public int getTeam_members() {
        return team_members;
    }

    public void setTeam_members(int team_members) {
        this.team_members = team_members;
    }

    public String getQuery_language() {
        return query_language;
    }

    public void setQuery_language(String query_language) {
        this.query_language = query_language;
    }

    public void printEmploymentYears(String working_since) { //will print the employment years
        int year = YearMonth.now().getYear(); //this method returns the current year
        int working_since_copy = Integer.parseInt(working_since); //parsing to Integer from String
        System.out.println("Employment year: " + (year - working_since_copy)); //calculating employment year
    }

    public void assignProject(String project_name, int team_members, String query_language) { //this works alike constructor
        this.project_name = project_name;
        this.team_members = team_members;
        this.query_language = query_language;
    }

    public void printAssignedProject() { //will print the project details
        System.out.println("project name: " + this.project_name
                + "\nnumber of team members: " + this.team_members + "\nquery language used: "
                + this.query_language + "\nworking since: " + this.working_since);
    }
}
