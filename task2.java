public class task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = 2;
        int d = 3;
        int count = 0;
        int degree = 1;
        if (b % d == 0) {
            count += 1;
        }
        while (a * c * degree < b) {
            if ((b - (a * c * degree)) % d == 0) {
                count += 1;
            }
            degree += 1;
        }

        while ((a + d) * c < b) {
            if ((a + d) * c < b) {
                count += 1;

            }
            d += d;
        }
        System.out.println(count);
    }
}
