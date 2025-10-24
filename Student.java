package Method;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Student extends Book{
    private Scanner sc = new Scanner(System.in);
    public HashMap<Integer, String> borrowed = new HashMap<>();
    public HashMap<Integer, String> returned = new HashMap<>();
    public ArrayList<User> user = new ArrayList<>();
    public void login(){
        System.out.println(" - ".repeat(7) + "Welcome Scholar of Batangas State University Lipa Campus!" + " - ".repeat(7));
        System.out.print("Enter G-Suite: ");
        String g_suite = sc.nextLine();
        System.out.print("Enter Password: ");
        String sr_code = sc.nextLine();
        if (sr_code.matches("\\d{2}-\\d{5}")){
            LocalDate date_login = LocalDate.now();
            LocalTime time_login = LocalTime.now();
            User newLogin = new User(g_suite, sr_code, date_login, time_login);
            user.add(newLogin);
            System.out.println("\f");
            System.out.println(" - ".repeat(7) + "Available Books" + " - ".repeat(7));
            availableBook();
            showBook();
            System.out.println(" - ".repeat(20));
            while (true){
                System.out.println("[1] Borrow Book\n[2] Return Book\n[3] Exit");
                System.out.print("Enter a number: ");
                int student_choice = sc.nextInt();
                if (student_choice == 1){
                    borrowBook();
                }else if(student_choice == 2){
                    returnBook();
                }else if(student_choice == 3){
                    break;
                }else{
                    System.out.println("Invalid input!");
                }
            }
        }else{
            System.out.println("Invalid credentials.");
        }
    }

    public void showBook(){
        for (Map.Entry<Integer, String> value : book.entrySet()){
            Integer id = value.getKey();
            String title = value.getValue();
            System.out.println("Book ID: " + id + " Title: " + title);
        }
    }
    public void borrowBook(){
        System.out.print("Book ID you want to borrow: ");
        int book_id = sc.nextInt();
        if (book.containsKey(book_id)){
            String title = book.get(book_id);
            borrowed.put(book_id, title);
            System.out.println("Successfuly Borrowed.");
        }else{
            System.out.println("Invalid ID.");
        }
    }

    public void returnBook(){
        if (borrowed.isEmpty()){
            System.out.println("No borrowed book yet.");
            return;
        }
        System.out.println(" - ".repeat(5) + "Book Borrowed" + " - ".repeat(5));
        for (Map.Entry<Integer, String> value2 : borrowed.entrySet()){
            int id = value2.getKey();
            String title = value2.getValue();
            System.out.println("ID: " + id + " Title: " + title);
        }
        System.out.print("Enter book id you want to return: ");
        int return_book = sc.nextInt();
        if (borrowed.containsKey(return_book)){
            String returnedTitle = borrowed.get(return_book);
            borrowed.remove(return_book);
            returned.put(return_book, returnedTitle);
        }else{
            System.out.println("Invalid book id.");
        }

    }
    public void showUser(){
        for (User u : user){
            System.out.println("G-Suite: " + u.getGsuite());
            System.out.println("Sr-Code: " + u.getSr_code());
            System.out.println("Date Login: " + u.getDate_login());
            System.out.println("Time Login: " + u.getTime_login());
        }
    }

}
