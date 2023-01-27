import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число   ");
        int n = console.nextInt();
        console.close();
        System.out.println("Треугольное число  " + n * (n + 1) / 2);
    }
}