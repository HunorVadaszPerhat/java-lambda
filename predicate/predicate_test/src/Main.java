import java.util.function.Predicate;

public class Main {
    // Predicate test evaluates this predicate on the given argument
    public static void main(String[] args) {
        Predicate<String> i  = (s)-> s.length() > 5;

        System.out.println(i.test("Hello World!"));
    }
}