import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> i  = (s)-> s.length() > 5;
        Predicate<String> j  = (s)-> s.length() < 3;

        System.out.println(i.or(j).test("Hello World!"));
    }
}