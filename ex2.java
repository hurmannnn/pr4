import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        int count = 0;
        int i = 0;

        while (i < text.length()) {
            char a = text.charAt(i);
            if (a == '.' || a == '!' || a == '?') {
                count++;
            }
            i++;
        }

        System.out.println("Кількість речень: " + count);
        scanner.close();
    }
}
