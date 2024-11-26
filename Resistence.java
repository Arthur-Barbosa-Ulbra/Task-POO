import java.util.Scanner;

public class Resistence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistences = new double[4];
        double resistencesSum = 0.0, superiorResistence, lowerResistence;

        System.out.println("Digite o valor de 4 resistências elétricas (Ohms): ");
        for (int i = 0; i < resistences.length; i++) {
            System.out.println("Resistência " + (i + 1) + ": ");
            resistences[i] = scanner.nextDouble();

            if (resistences[i] <= 0) {
                System.out.println("O valor da resistência deve ser maior que zero!");
                i--;
            }
        }

        superiorResistence = resistences[0];
        lowerResistence = resistences[0];

        for(double resistence : resistences){
            resistencesSum += resistence;
        }

        for (double resistence : resistences) {
            if (resistence > superiorResistence) {
                superiorResistence = resistence;
            }
            if (resistence < lowerResistence) {
                lowerResistence = resistence;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Resistência equivalente (em série): " + resistencesSum + " ohms");
        System.out.println("Maior resistência: " + superiorResistence + " ohms");
        System.out.println("Menor resistência: " + lowerResistence + " ohms");

        scanner.close();
    }
}
