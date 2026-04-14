import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
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

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Reuse UC7 bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Executive", 90));
        bogies.add(new Bogie("General", 60));

        // Threshold
        int threshold = 60;

        // 🔹 Stream filtering operation
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        // 🔹 Display original list
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // 🔹 Display filtered result
        System.out.println("\nFiltered Bogies (capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);
    }
}