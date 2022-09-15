import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char operation = getOperation();
        int res1 = result(num1, num2, operation);
        System.out.println("Результат операції: " + res1);
    }
    public static int getNum() {
        System.out.println("Введіть ціле число: ");
        return scanner.nextInt();
    }

    public static char getOperation() {
        System.out.println("Введіть математичну операцію (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static int result(int num1, int num2, char operation) {
        int result1;
        switch (operation) {
            case('+'):
                result1 = num1 + num2;
                break;
            case ('-'):
                result1 = num1 - num2;
                break;
            case ('*'):
                result1 = num1 * num2;
                break;
            case ('/'):
                result1 = num1 / num2;
                break;
            default:
                System.out.println("Введіть правильну операцію!!!!");
                result1 = result(num1, num2, operation);
        }
        return result1;
    }

}
