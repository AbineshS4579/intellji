
import java.util.*;
public class clearscream {
    public class Main {

        static void clearScreen() throws Exception {
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        }

        public static void main(String[] args) throws Exception {

            // Task 1
            System.out.println("Task 1 completed!");

            // Clear screen after Task 1
            Thread.sleep(1000);
            clearScreen();

            // Task 2
            System.out.println("Task 2 started...");
        }
    }
}
