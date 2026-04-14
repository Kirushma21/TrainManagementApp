import java.util.*;
import java.util.stream.Collectors;

// Bogie class
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

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Executive", 90));
        bogies.add(new Bogie("General", 60));
        bogies.add(new Bogie("Sleeper", 72));

        int threshold = 60;

        // =========================
        // 🔹 LOOP-BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > threshold) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // 🔹 STREAM-BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // OUTPUT
        // =========================
        System.out.println("\nFiltered Results (Loop):");
        loopResult.forEach(System.out::println);

        System.out.println("\nFiltered Results (Stream):");
        streamResult.forEach(System.out::println);

        System.out.println("\n================ Performance Comparison ================");

        System.out.println("Loop Execution Time   : " + loopTime + " nanoseconds");
        System.out.println("Stream Execution Time : " + streamTime + " nanoseconds");

        // Optional correctness check
        System.out.println("\nResults Match: " + (loopResult.size() == streamResult.size()));
    }
}