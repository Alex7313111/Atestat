import java.util.ArrayList;
import java.util.Map;

public class Phone {
    
    // Метод, который добавляет номера в книгу
    public static  void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(Integer.valueOf(value));
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.valueOf(value));
            map.put(key, list);
        }
    }
    public static void sortBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones += 1 ;
            }

            System.out.printf("%s: %s \n", item.getKey(), phones);
        }

    }

    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }




}

  /*  private void sortContacts() {

        contacts = new LinkedHashMap<>();

        Stream<Map.Entry<String, List<String>>> sorted;
        sorted = contacts.entrySet().stream()

                .sorted(Map.Entry.<String, List<String>>; comparingByValue(Comparator.comparingInt(Phone::applyAsInt)).reversed())

                .sorted.forEachOrdered(x -> contacts.put(x.getKey(), x.getValue()));

    }*/
