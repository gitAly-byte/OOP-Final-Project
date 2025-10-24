package Methods;

import java.util.HashMap;

public class Book {
    static HashMap<Integer, String> books = new HashMap<>();
    static void availableBooks() {
        books.put(1, "Advance Compute Programming");
        books.put(2, "Database Management");
        books.put(3, "Networking 1");
        books.put(4, "Physics-Calculus");
        books.put(5, "Objected Oriented Programming");
        books.put(6, "Discrete Mathematiics");
    }
}
