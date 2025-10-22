import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть знак: ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;

            case '/':
                result = a / b;
                System.out.println("Результат: " + result);
                break;

        }

        scanner.close();
    }
}