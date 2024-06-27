import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorter {
    public static void main(String[] args) {
    
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sahil", 30));
        people.add(new Person("junior", 25));
        people.add(new Person("kelly", 35));
        people.add(new Person("hyper", 20));

        // Sort the list by age using a lambda expression
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        
        people.forEach(System.out::println);
    }
}
