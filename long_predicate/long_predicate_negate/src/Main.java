import java.util.function.LongPredicate;

public class Main {
    public static void main(String[] args) {
        LongPredicate i = (l) -> l > 0;

        System.out.println(i.negate().test(Long.MAX_VALUE));
    }
}