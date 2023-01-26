public class task2 {
    public static void main(String[] args) {
        System.out.println(worker(2, 9));
    }

    public static int worker(int a, int b) {
        if (a == b) {
            return 1;
        }
        if (a > b) {
            return 0;
        } else {
            return worker(a + 1, b) + worker(a * 2, b);
        }

    }
}
