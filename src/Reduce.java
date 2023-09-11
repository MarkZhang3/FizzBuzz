public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;
        while (n > 0) {
            n = reduce(n);
            counter ++;
        }
        System.out.println(counter);
    }

    private static int reduce(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n - 1;
        }
    }
}
