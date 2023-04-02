import java.util.function.DoublePredicate;

public class Main {
    public static void main(String[] args) {
        DoublePredicate dp = (d) -> d > 0;
        DoublePredicate dp1 = (d) -> d == 0;

        System.out.println(dp.and(dp1).test(0.5));    }
}