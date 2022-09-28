public class Main extends Logic{
    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char operation = getOperation();
        int res1 = result(num1, num2, operation);
        System.out.println("Результат операції: " + res1);
    }

}
