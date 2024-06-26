import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class listnames {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter the size of your list names:");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("your list names: " + names);

        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        // Print the repeated names and their counts
        System.out.println("Repeated names and their counts:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times Repeated");
            }
        }

        /* 
        // 2. Adding Elements
        names.add("RAM");
        names.add("SHYAM");
        names.add("Rohan");
        names.add("black devil");
        names.add("RAM");

        System.out.println("your List of names is : " + names);
        
        names.remove("black devil");

        System.out.println("printing after removing a name and then Iterating over list:");
        for (String name : names) {
            System.out.print(" " + name);
        }
        */
    
    }
}