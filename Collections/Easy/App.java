package Easy;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 01 - Name list
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Berg");
        names.add("Carlos");
        names.add("David");
        for(String name : names){
            System.out.println(name);
        }
        names.remove("Berg");
        System.out.println(names);

        // 02 - HashSet (no repetitions)
        Set<Integer> numbers = new HashSet<>();
        numbers.add(20);
        numbers.add(20);
        numbers.add(31);
        numbers.add(54);
        numbers.add(86);
        numbers.add(98);
        numbers.add(98);
        System.out.println(numbers);

        // 03 - People map
        Map<String, Integer> people = new HashMap<>();
        people.put("Anna", 20);
        people.put("Berg", 30);
        people.put("Carlos", 24);
        people.put("David", 57);
        for(Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " has " + entry.getValue() + " years!");
        }

        people.remove("Berg");
        System.out.println(people);
    }
}
