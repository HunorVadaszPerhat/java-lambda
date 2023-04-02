import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> i  = (s)-> s.length() > 5;

        System.out.println(i.negate().test("Hello World!"));
    }
}