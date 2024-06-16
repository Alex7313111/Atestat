import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phoneMain {
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();


        Phone.addNumber("Ivan", 8123, bookPhone);
        Phone.addNumber("Ivan", 15234, bookPhone);
        Phone.addNumber("Petr", 5462585, bookPhone);
        Phone.addNumber("Petr", 15462585, bookPhone);
        Phone.addNumber("Petr", 95462585, bookPhone);
        Phone.addNumber("Ivan", 123568233, bookPhone);
        Phone.addNumber("Petr", 7879897, bookPhone);
        Phone.printBook(bookPhone);

    }
}
