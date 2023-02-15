import java.util.Scanner;

public class Task_3 {
    static int calc(int num1, int num2, String sign) {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(sc.nextLine()); //sc.nextInt();
        System.out.println("Введите операцию +, -, /, *");
        String sign = sc.nextLine();
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(sc.nextLine()); //sc.nextInt();
        int result = calc(num1, num2, sign);
        System.out.printf("%d %s %d = %d", num1, sign, num2, result);
        sc.close();
    }
}
