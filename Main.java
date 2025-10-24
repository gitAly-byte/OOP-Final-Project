import Method.Admin;
import Method.Student;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Student student = new Student();
        Admin admin = new Admin(student);
        Scanner choice = new Scanner(System.in);
        System.out.println(" = ".repeat(7) + "Welcome to Library of Batangas State University Lipa Campus!");
        while (true){
            System.out.println("[1] Admin\n[2] Student\n[3] Exit");
            System.out.print("Enter a number: ");
            int num = choice.nextInt();
            if (num == 1){
                admin.login_Admin();
            } else if (num == 2) {
                student.login();
            } else if (num == 3) {
                System.exit(0);
            }else{
                System.out.println("Invalid input.");
            }
        }

    }
}