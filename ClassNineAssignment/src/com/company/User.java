package com.company;

public class User {
    //declaring some private variables
    private String name;
    private int id;
    private String email;

    public String getName() { //will return the name
        return name;
    }

    public void setName(String name) { //will set the value as the parameter in variable "name"
        this.name = name;
    }

    public int getId() { //will return the id
        return id;
    }

    public void setId(int id) { //will set the value as the parameter in variable "id"
        this.id = id;
    }

    public String getEmail() { //will return the email
        return email;
    }

    public void setEmail(String email) { //will set the value as the parameter in variable "email"
        if (verifyEmail(email)) { //will verify the email using the user-defined method verifyEmail
            this.email = email;
        } else { //if verify email returns false
            System.out.println("inappropriate email");
        }
    }

    public boolean verifyEmail(String email) { //to verify if it's a legit email or not from the parameter that is passed
        int verification_at = 0, verification_dot = 0, verification_space = 0;
        for (int i = 0; i<email.length(); i++) {
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
}
