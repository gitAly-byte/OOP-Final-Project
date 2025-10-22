package Methods;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Student{
    private String student_name;
    private String sr_code;
    private LocalDate login_date;
    private LocalTime login_time;

    public Student(String student_name, String sr_code){
        this.student_name = student_name;
        this.sr_code = sr_code;
        this.login_date = LocalDate.now();
        this.login_time = LocalTime.now();
    }
    public void displayInfo() {
        System.out.println("Student name: " + this.student_name);
        System.out.println("Student Sr-Code: " + this.sr_code);
        System.out.println("Login Date: " + this.login_date);
        System.out.println("Login Time: " + this.login_time);
    }

    public void choice(){

    }

}
