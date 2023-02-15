import java.util.Scanner;

/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt(); // Integer.parseInt(sc.nextLine());
        int sum = 0, fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна: %d\n", n, sum);
        System.out.printf("%d! равен: %d\n", n, fact);
        sc.close();
    }
}