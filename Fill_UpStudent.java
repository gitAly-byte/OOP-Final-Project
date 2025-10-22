package Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Fill_UpStudent {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();

    public void enterInfo() {
        System.out.println("WELCOME TO THE LIBRARY OF BATANGAS STATE UNIVERSITY LIPA CAMPUS!");
        while (true) {
            System.out.println("[1] Admin\n[2] Student\n[3] Exit");
            System.out.print("Enter a number: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (students.isEmpty()) {
                    System.out.println("No student has logged in yet.\n");
                } else {
                    System.out.println("\n--- LOGGED-IN STUDENTS ---");
                    for (Student s : students) {
                        s.displayInfo();
                    }
                }
                System.out.println("\f");
            } else if (choice == 2) {
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                System.out.print("Enter your SR-CODE: ");
                String sr_code = sc.nextLine();

                if (sr_code.matches("\\d{2}-\\d{5}")) {
                    Student value = new Student(name, sr_code);
                    students.add(value);
                    System.out.println(" - ".repeat(5) + " Welcome " + name + " to the BSU Lipa Library! " + " - ".repeat(5));
                    System.out.println();
                } else {
                    System.out.println("Invalid SR-CODE! Please try again.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
}
