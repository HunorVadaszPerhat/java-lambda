import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate i = (x)-> x < 0;

        System.out.println(i.test(1234));
    }
}