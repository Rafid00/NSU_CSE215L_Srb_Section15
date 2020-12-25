package com.company;

import java.lang.reflect.Method;

public class Employees {
    //calling the variables
    private String name;
    private int id;
    private double salary;
    private String email;

    public Employees(String name, int id, double salary, String email) { //creating the constructor
        this.name = name;
        this.id = id;
        this.salary = salary;
        setEmail(email);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (verifyEmail(email)) { //will verify the email using the user-defined method verifyEmail
            this.email = email;
        } else { //if verify email returns false
            System.out.println("inappropriate email");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean verifyEmail(String email) { //to verify if it's a legit email or not from the parameter that is passed
        int verification_at = 0, verification_dot = 0, verification_space = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@' && email.charAt(i + 1) != '.') { //will find a @ and will make sure if there is some letters exist after @
                verification_at++;
            }
            if (email.charAt(i) == '.' && email.charAt(i + 1) != ' ') { //will find the dots
                verification_dot++;
            }
            if (email.charAt(i) == ' ') { //as emails cant have spaces in between, it is will make sure that condition
                verification_space++;
            }
        }

        if (verification_at == 1 && verification_dot > 0 && verification_space == 0) { //if the conditions are true then it will return true (verified email)
            return true;
        }

        return false; //if the email user provided isn't appropriate then it will return false

    }

    public void printStatus(String getName, int id, double salary) { //will print the employees details
        System.out.println("name: " + getName + "\nid: " + this.id + "\nsalary: " + this.salary + "\nemail: " + this.email);
    }

}
