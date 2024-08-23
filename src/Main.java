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
        // 2.1 - Si la clé est déjà présente, la nouvelle valeur remplace l’ancienne
        map.put("Potatoes", 4);

        // 2.2 - Ajoute une map à une map
        map.putAll(new HashMap<String, Integer>(){{
            put("Mango", 5);
            put("Orange", 6);
        }});

        // 2.3 - Insère l’entrée (K, V) si la clé K n’est pas déjà associée à la valeur V
        map.putIfAbsent("Orange", 6);

        // 3- Display
        // 3.1 - map size
        System.out.println("3.1- Display map size : " + map.size());

        // 3.2 - Retourne la valeur associée à la clé K spécifiée. Si la clé n’est pas trouvée, elle retourne la valeur par défaut
        System.out.println("3.1- valeur associée à la clé Mango : " + map.get("Mango"));

        // 3.3 - pour getOrDefault cf. CounterMap

        // 3.4 - Vérifie si la clé spécifiée K est présente dans le Map ou non
        System.out.println("Vérifie si la clé Mango est présente : " + map.containsKey("Mango"));

        // 3.5 - Vérifie si la valeur spécifiée V est présente dans le Map ou non
        System.out.println("Vérifie si la valeur 6 est présente : " + map.containsValue(6));

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

        // 8- Replace an element in a map
        map.replace("Orange", 14);
        map.replace("Orange", 14, 4);

        // 9- Remove an element in a map
        map.remove("Potatoes");
        map.remove("Cherry", 3 );

        //10 - Retourne
        // 10.1- l'ensemble de toutes les clés
        System.out.println("10.1- return all keys : " + map.keySet());

        // 10.2- l'ensemble de toutes les valeurs
        System.out.println("10.2- return all values : " + map.values());

        // 10.2- l'ensemble de toutes les clés valeurs
        System.out.println("10.3- return all keys values : " + map.entrySet());

    }
}