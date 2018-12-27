import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main2(String[] args) {
        System.out.println(test((i) -> i == 5));
        System.out.println(test((i) ->
        {
            return i == 5;
        }));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
    }
}
