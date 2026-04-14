import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7/UC8)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " → " + capacity;
    }
}

public class TrainManagementgit checkout -b feature/uc9-group-bogies

        git add .
        git commit -m "UC9: Group bogies by type using Collectors.groupingBy"

        git push origin feature/uc9-group-bogiesApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));

        // 🔹 Grouping bogies by name (type)
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // 🔹 Display original list
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // 🔹 Display grouped result
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}