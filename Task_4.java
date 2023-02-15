import java.util.Scanner;

public class Task_4 {
    static int Ind(String num) {
        if (num.indexOf("?") > -1) {
            if (num.indexOf("?") != num.lastIndexOf("?")) {
                return 100;
            } else {
                return 10;
            }
        }
        return 1;
    }

    private static int changeNum(String num, int ind, int currIndex) {
        int res = 0;
        switch (ind) {
            case 10:
                res = Integer.parseInt(num.replace("?", Integer.toString(currIndex)));
                break;
            case 100:
                res = Integer.parseInt(num.replace("??", Integer.toString(currIndex)));
                break;
            case 1:
                res = Integer.parseInt(num);
            default:
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String userInput = sc.nextLine();
        String num1 = userInput.substring(0, 2);
        String num2 = userInput.substring(3, 5);
        String num3 = userInput.substring(6);
        System.out.println(userInput);
        sc.close();
        int ind1, ind2, ind3;
        ind1 = Ind(num1);
        ind2 = Ind(num2);
        ind3 = Ind(num3);
        boolean much = true;
        int i = 0;
        int j = 0;
        int k = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        while (much & i < ind1) {
            x = changeNum(num1, ind1, i);
            j = 0;
            while (much & j < ind2) {
                y = changeNum(num2, ind2, j);
                k = 0;
                while (much & k < ind3) {
                    z = changeNum(num3, ind3, k);
                    if (x + y == z) {
                        much = false;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        if (much) {
            System.out.println("Решений нет");
        } else {
            System.out.printf("Одно из решений %d+%d=%d", x, y, z);
        }
    }
}