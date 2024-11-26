import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Digite um número inteiro: ");
        number = scanner.nextInt();

        System.out.println("Tabuada do número " + number + " de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }

        scanner.close();
    }
}
