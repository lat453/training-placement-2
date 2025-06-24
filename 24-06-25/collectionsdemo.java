import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");

        Set<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println(names);
        System.out.println(ids);
        System.out.println(students);
    }
}
colletionsdemo
