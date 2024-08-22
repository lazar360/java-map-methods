import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1- Create a map and Initialize datas in a map
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("Apple", 1);
            put("Banana", 2);
            put("Cherry", 3);
        }};
        System.out.println("1- Create a map and Initialize datas in a map : " + map);

        // 2- Add an element
        map.put("Potatoes", 4);
        // map.put("Potatoes", 4); compile but does not have any effects

        // 3- Display map size
        System.out.println("3- Display map size" + map.size());

        // 4- Autosort with treeMap (asc)
        Map<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Orange", 4);
        sortedMap.put("Banana", 2);
        sortedMap.put("Apple", 1);
        System.out.println("4- Autosort with treeMap (asc)" + sortedMap);

        // 5- Iterate over a map with a loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("5- Iterate over a map with a loop" + "Clé: " + entry.getKey() + ", Valeur: " + entry.getValue());
        }

        // 6- Iterate with method forEach (best syntax)
        map.forEach((key, value)-> System.out.println("6- Iterate with method forEach (best syntax)" + "Clé : " + key + ", Valeur : " + value));

        // 7- Counter map
        List<String> fruits = new ArrayList<>(Arrays.asList("Orange", "Banana", "Banana", "Apple"));
        Map<String, Integer> counterMap = new HashMap<>();
        for (String fruit : fruits) {
            int counter = counterMap.getOrDefault(fruit, 0);
            counterMap.put(fruit, counter + 1);
        }
        System.out.println("7- Counter map " + counterMap);

    }
}