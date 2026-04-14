import java.util.ArrayList;
import java.util.List;

// Bogie class (same model as UC7–UC9)
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

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Executive", 90));

        // 🔹 Extract capacity and reduce (sum)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 🔹 Display bogies
        System.out.println("\nBogie List:");
        bogies.forEach(System.out::println);

        // 🔹 Display total capacity
        System.out.println("\nTotal Seating Capacity of Train:");
        System.out.println(totalSeats);
    }
}