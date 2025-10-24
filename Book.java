package Method;

import java.util.HashMap;
import java.util.Map;

public class Book {
    public HashMap<Integer, String> book = new HashMap<>();
    void availableBook(){
        book.put(1, "Computer Programming");
        book.put(2, "Advance Computer Programming");
        book.put(3, "Database Managament");
        book.put(4, "Objected-Oriented-Programming");
        book.put(5, "Networking 1");
        book.put(6, "Discrete Mathematics");
        book.put(7, "Physic-Calculus");
    }
}
