import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> i  = Predicate.isEqual("Bye bye!");

        System.out.println(i.test("Hello World!"));
    }
}