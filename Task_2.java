import java.util.Scanner;

public class Task_2 {
    static void eratosfen(int n) {
        n = n + 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                array[i] = i;
            }
        }
        array[1] = 1;
        array[2] = 2;
        int m = 2;
        while (m < n) {
            if (array[m] != 0) {
                int j = m * 2;
                while (j < n) {
                    array[j] = 0;
                    j = j + m;
                }
            }
            m += 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.printf("%d  ", array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа выводит все простые числа от 1 до N. Введите N");
        int n = sc.nextInt();
        eratosfen(n);
        sc.close();
    }
}
