package Method;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Admin extends Student {
    private Scanner sc_admin = new Scanner(System.in);
    private String email = "Admin1";
    private String password = "AdminPassword";
    private Student student; // study this one

    //and also thiss oneee
    public Admin(Student student) {
        this.student = student;
    }


    public void login_Admin() {
        System.out.println(" = ".repeat(7) + "LOGIN ADMIN" + " = ".repeat(7));
        System.out.print("Admin G-Suite: ");
        String admin_gsuite = sc_admin.nextLine();
        System.out.print("Admin Password: ");
        String admin_password = sc_admin.nextLine();
        if (admin_gsuite.equals(getEmail()) && admin_password.equals(getPassword())) {
            System.out.println(" - ".repeat(7) + "Welcome Admin!" + " - ".repeat(7));
            System.out.println("\f");
            System.out.println(" - ".repeat(20));
            while (true) {
                System.out.println("[1] View Student Enter\n[2] View Borrowed Book\n[3] Return Book\n[4] Exit");
                System.out.print("Enter a number: ");
                int num = sc_admin.nextInt();
                if (num == 1) {
                    student.showUser();
                } else if (num == 2) {
                    viewBorrowedBook(student);
                } else if (num == 3) {
                    returnBook();
                } else if (num == 4) {
                    break;
                }else {
                    System.out.println("Invalid input.");
                }
            }
        }
    }

    public void viewBorrowedBook(Student student){
        System.out.println(" = ".repeat(20));
        for (User u: student.user){
            System.out.println("Student G-Suite: " + u.getGsuite());
            System.out.println("Student Sr-Code: " + u.getSr_code());
        }
        for (Map.Entry<Integer, String> borrowed : student.borrowed.entrySet()){
            int id = borrowed.getKey();
            String title = borrowed.getValue();
            System.out.println("Book ID: " + id + " Title: " + title);
            System.out.println(" = ".repeat(20));
        }
    }
    public void returnBook(Student student) {
        System.out.println(" = ".repeat(20));
        for (User u : student.user){
            System.out.println("Student G-Suite: " + u.getGsuite());
            System.out.println("Student Sr-Code: " + u.getGsuite());
        }
        for (Map.Entry<Integer, String> returned_value : student.returned.entrySet()) {
            int id = returned_value.getKey();
            String title = returned_value.getValue();
            System.out.println("ID: " + id + " Title: " + title);
            System.out.println(" = ".repeat(20));
        }

    }
        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password){
            this.password = password;
        }

    }


