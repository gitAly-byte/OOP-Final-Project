package Methods;

import java.util.Scanner;
public class Admin{
    Scanner sc = new Scanner(System.in);
    private String adminEmail = "Admin";
    private String adminPass = "AdminPassword";

    void Login(){
        System.out.print("Enter Admin Email: ");
        String emailAdmin = sc.nextLine();
        System.out.print("Enter Admin Password: ");
        String passwordAdmin = sc.nextLine();
        if (emailAdmin.equals(this.adminEmail) && passwordAdmin.equals(this.adminPass)){
            System.out.println(" = ".repeat(7) + "Welcome admin!" + " = ".repeat(7));
        }else{
            System.out.println("Invalid Admin Account!");
        }
    }
    void Choice(Student student){
        System.out.println("[1] Student Login\n[2] Borrowed Book\n[3] Returned Book\n[4] Exit");
        System.out.print("Enter a number: ");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println(" - ".repeat(7) + "Student Entered Library" + " - ".repeat(7));
            student.displayInfo();


        }
    }
}
