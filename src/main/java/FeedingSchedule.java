public class FeedingSchedule {

    private static void firstFeedingSchedule() {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            System.out.println("y = " + y);
            switch (y) {
                default:
                    System.out.println("switch case default x = " + x);
                case 0:
                    x -= 1;
                    System.out.println("switch case 0 x = " + x);
                    break;
                case 1:
                    x += 5;
                    System.out.println("switch case 1 x = " + x);

            }
        }
        System.out.println("x = " + x);
    }

    private static void secondFeedingSchedule() {
        int x = 5, j = 0;
        outer:
        for (int i = 0; i < 3; )
            inner:do {
                i++;
                x++;
                if (x > 10)
                    break inner;

                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);
    }

    public static void main(String[] args) throws IllegalArgumentException {
        firstFeedingSchedule();
        secondFeedingSchedule();
    }
}
