package com.rafid;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient("la", -2, "corona");
        Patient patient2 = new Patient("a", -32, "diabetes");
        Patient patient3 = new Patient("sabbir", 42, "diabetes");
        System.out.println("valid name: " + patient3.getName() + "\nvalid age: " + patient3.getAge());
    }
}
