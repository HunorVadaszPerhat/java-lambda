import java.util.function.DoublePredicate;

public class Main {
    public static void main(String[] args) {
        DoublePredicate dp = (d) -> d > 0;

        System.out.println(dp.test(0.5));
        System.out.println(dp.negate().test(0.5));
    }
}