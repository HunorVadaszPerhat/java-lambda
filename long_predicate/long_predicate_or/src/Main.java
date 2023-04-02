import java.util.function.LongPredicate;

public class Main {
    public static void main(String[] args) {
        LongPredicate i = (l) -> l > 0;
        LongPredicate j = (l) -> l == 0;

        System.out.println(i.or(j).test(Long.MAX_VALUE));
    }
}