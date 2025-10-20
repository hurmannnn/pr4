import java.util.Scanner;
import java.text.MessageFormat;

public class Lab3_Hurman_KN21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть строку: ");
        String textValue = scanner.nextLine();

        System.out.print("Введіть логічне значення: ");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("Кінець");

        System.out.println("1");
        System.out.println("Ціле число: " + intValue + " Число з плаваючою крапкою: " + doubleValue +
                " Строка: " + textValue + " Логічне значення: " + boolValue);
        System.out.println();

        System.out.println("2");
        String template = "Ціле число: {0,number,integer} Число з плаваючою крапкою: {1} Строка: {2} Логічне значення: {3}";
        String message = MessageFormat.format(template, intValue, doubleValue, textValue, boolValue);
        System.out.println(message);

        System.out.println("3");
        System.out.printf("Десяткове число: %d", intValue);
        System.out.printf(" Число з плаваючою крапкою: %f", doubleValue);
        System.out.printf(" Шістнадцяткове: %x", intValue);
        System.out.printf(" Число з плаваючою точкою науковому записі: %e", doubleValue);
        System.out.printf(" Строка: %s", textValue);
        System.out.println("кінець");
        scanner.close();
    }
}