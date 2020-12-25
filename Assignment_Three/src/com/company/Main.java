package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creating object and assigning default values in constructors and methods
        Scanner in = new Scanner(System.in);
        Employees em = new Employees("unknown", 999999, 00000, "unknown@unknown.com");
        DBA dba = new DBA("unknown", 999999, 00000, "unknown@unknown.com", "2020");
        dba.assignProject("project negative", 29, "SQL");
        BackEndDev bed = new BackEndDev("unknown", 999999, 00000, "unknown@unknown.com", "2020", true);
        bed.assignProject("project negative", 17, "django");
        FrontEndDev fed = new FrontEndDev("unknown", 999999, 00000, "unknown@unknown.com", "2020", true, 9, "unknown");
        fed.assignProject("project negative", 12, "react");

        int option;
        do { // this loop or menu will run unless user input 0 which is quit
            System.out.println("1. Employees\n2. DBA\n3. BackEndDev\n4. FrontEndDev\n" +
                    "5. Show Employees\n6. Show DBA\n7. Show BackEndDev\n8. Show FrontEndDev\n0. Quit");
            option = in.nextInt();
            in.nextLine();
            if (option == 1) { //taking input for Employees class
                System.out.println("name: ");
                em.setName(in.nextLine());
                System.out.println("id: ");
                em.setId(in.nextInt());
                in.nextLine();
                System.out.println("salary: ");
                em.setSalary(in.nextDouble());
                in.nextLine();
                System.out.println("email: ");
                em.setEmail(in.nextLine()); //if email isn't valid it will throw a error messege and the value wont be save, it will use the default one
            } else if (option == 2) { //taking input for DBA class
                System.out.println("working since (year): ");
                dba.setWorking_since(in.nextLine());
                System.out.println("project name: ");
                dba.setProject_name(in.nextLine());
                System.out.println("how many team memebers: ");
                dba.setTeam_members(in.nextInt());
                in.nextLine();
                System.out.println("query language: ");
                dba.setQuery_language(in.nextLine());
            } else if (option == 3) { //taking input for BackEndDev class
                System.out.println("working since (year): ");
                bed.setWorking_since(in.nextLine());
                System.out.println("project name: ");
                bed.setProject_name(in.nextLine());
                System.out.println("how many team memebers: ");
                bed.setTeam_members(in.nextInt());
                System.out.println("scrum master (true/false): ");
                bed.setScrum_master(in.nextBoolean());
            } else if (option == 4) { //taking input for FrontEndDev class
                System.out.println("working since (year): ");
                fed.setWorking_since(in.nextLine());
                System.out.println("project name: ");
                fed.setProject_name(in.nextLine());
                System.out.println("how many team memebers: ");
                fed.setTeam_members(in.nextInt());
                System.out.println("team leader: ");
                fed.setTeam_leader(in.nextLine());
            } else if (option == 5) { //it will printout the values user passed in Employee(em) object
                System.out.println();
//                System.out.println("name: " + em.getName());
//                System.out.println("id: " + em.getId());
//                System.out.println("salary: " + em.getSalary());
//                System.out.println("email: " + em.getEmail());
                int id = em.getId();
                double salary = em.getSalary();
                em.printStatus(em.getName(), id, salary);
                System.out.println();
            } else if (option == 6) { //it will printout the values user passed in DBA(dba) object
                System.out.println();
                dba.printEmploymentYears(dba.getWorking_since()); //will print the employment year
                dba.printAssignedProject(); // will print the assigned project details
                System.out.println();
            } else if (option == 7) { //it will printout the values user passed in BackEndDev(bed) object
                System.out.println();
                bed.printEmploymentYears(bed.getWorking_since());
                bed.printAssignedProject();
                System.out.println();
            } else if (option == 8) { //it will printout the values user passed in FrontEndDev(fed) object
                System.out.println();
                fed.printEmploymentYears(fed.getWorking_since());
                fed.printAssignedProject();
                System.out.println();
            }
        } while (option != 0); // will break the loop
    }

}
