package com.rafid;

public class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        setName(name);
        setAge(age);
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            int charCount = 0;
            for (int i = 0; i < name.length(); i++) {
                charCount++;
            }
            if (charCount < 3) {
                throw new InvalidNameException("Invalid Name! Name should be 3 letters or more!");
            }
            this.name = name;
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Invalid Age! Age can't be negative!");
            }
            this.age = age;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
