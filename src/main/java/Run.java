import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Norbert on 2017-08-13.
 */
public class Run {

    public static void main(String[] args) {

        Person andrzej = new Person("Andrzej", "Gołota", "boxer");        //1
        Person lewy = new Person("Robert", "Lewandowski", "footballer");        //2
        Person kubika = new Person("Robert", "Kubica", "race driver");        //3

        Map<String, Person> sportsmanMap = new HashMap<>();

        sportsmanMap.put(generateKey(andrzej), andrzej);
        sportsmanMap.put(generateKey(lewy), lewy);
        sportsmanMap.put(generateKey(kubika), kubika);

       // System.out.println("Map size: " + sportsmanMap.size());

//        Person fromMap = sportsmanMap.get(1);
//        System.out.println(fromMap);

        for (Person person : sportsmanMap.values()) {
            System.out.println(person);
        }

//        for (Entry<String, Person> entry : sportsmanMap.entrySet()) {
//            String id = entry.getKey();
//            Person person = entry.getValue();
//
//            System.out.println(id + " " + person);
//        }

//        Set<String> keySet = sportsmanMap.keySet();
//
//        for (String key : keySet) {
//            Person person = sportsmanMap.get(key);
//            System.out.println(key+ " "+ person);
//        }

        //streamExample(keySet);
    }

    private static void streamExample(Set<String> keySet) {
        System.out.println("\nThis is stream:\n");

        keySet.forEach(System.out::println);
    }

    private static String generateKey(Person person) {
    return person.getName() + person.getSurname();
    }
}
