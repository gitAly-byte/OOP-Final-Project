package Methods;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Fill_UpStudent {
    private Scanner sc = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Integer> borrowedBook = new ArrayList<>();
    Admin admin = new Admin();


    public void enterInfo() {
        while (true) {
            System.out.println("[1] Admin\n[2] Student\n[3] Exit");
            System.out.print("Enter a number: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                admin.Login();

                /*
                if (students.isEmpty()) {
                    System.out.println("No student has logged in yet.\n");
                } else {
                    System.out.println("\n--- LOGGED-IN STUDENTS ---");
                    for (Student s : students) {
                        s.displayInfo();
                    }
                }
                System.out.println("\f");

 */
            } else if (choice == 2) {
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                System.out.print("Enter your SR-CODE: ");
                String sr_code = sc.nextLine();

                if (sr_code.matches("\\d{2}-\\d{5}")) {
                    Student value = new Student(name, sr_code);
                    students.add(value);
                    System.out.println(" = ".repeat(21));
                    System.out.println(" - ".repeat(5) + " Welcome " + name + " to the BSU Lipa Library! " + " - ".repeat(5));
                    System.out.println(" = ".repeat(21));
                    while (true){
                        System.out.println("[1] Borrow Book\n[2] Return Book\n[3] Logout");
                        System.out.print("Enter a number: ");
                        int choice1 = sc.nextInt();
                        if (choice1 == 1){
                            Book.availableBooks();
                            System.out.println(" - ".repeat(5) + "Available Book" + " - ".repeat(5));
                            for (Integer bookNo: Book.books.keySet()){
                                System.out.println("Book no. " + bookNo + " Book Title: " + Book.books.get(bookNo));
                            }
                            System.out.print("Book no. you want to borrow: ");
                            int choice2 = sc.nextInt();
                            if (Book.books.containsKey(choice2)){
                                borrowedBook.add(choice2);
                                System.out.println("Successfuly Borrowed Book.");
                            }else{
                                System.out.println("Unavailable Book.");
                            }
                        }else if(choice1 == 2){
                            System.out.println("Your Borrowed Book: ");
                            if (borrowedBook.isEmpty()){
                                System.out.println("No borrowed book yet.");
                            }else{
                                for (Integer bookNo : borrowedBook){
                                    String bookTitle = Book.books.get(bookNo);
                                    System.out.println("Book no. " + bookNo + " Book Title: " + bookTitle);
                                }
                                System.out.print("Return Book: ");
                                int returnBook = sc.nextInt();
                                if (borrowedBook.contains(returnBook)){
                                    borrowedBook.remove(Integer.valueOf(returnBook));
                                    System.out.println("Removed Successfuly.");
                                }else{
                                    System.out.println("Invalid book no.");
                                }
                            }
                        } else if (choice1 == 3){
                            System.out.println("Logging out");
                            break;
                        }
                    }
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
