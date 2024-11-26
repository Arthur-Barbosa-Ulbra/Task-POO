import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        double prodValue, discont, prodDiscont;

        System.out.println("Digite o valor do produto:");
        prodValue = scanner.nextDouble();

        System.out.println("Digite a porcentagem do desconto:");
        discont = scanner.nextDouble();

        System.out.println("Calculando...");
        prodDiscont = (prodValue * discont) / 100;

        System.out.println("O valor do produto com desconto é R$" + formatter.format(prodValue - prodDiscont));

        scanner.close();
    }
}