import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate i = (x)-> x < 0;
        IntPredicate j = (x)-> x == 0;

        System.out.println(i.or(j).test(1234));
    }
}