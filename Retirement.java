import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, contriYears, minAge = 0, minContriYears = 0, missingAge, missingContriYears;
        String gender;
        boolean retirementCheck;

        System.out.print("Digite sua idade: ");
        age = scanner.nextInt();

        System.out.print("Digite seus anos de contribuição: ");
        contriYears = scanner.nextInt();

        System.out.println("Digite seu sexo (M para masculino, F para feminino): ");
        gender = scanner.next();
        switch (gender) {
            case "M":
            case "F":
                minAge = gender.equalsIgnoreCase("M") ? 65 : 60;
                minContriYears = gender.equalsIgnoreCase("M") ? 35 : 30;
                break;
            default:
                System.out.println("Opção inválida!!");
                System.out.println("Tente novamente...");
                System.exit(0);
                break;
        }

        retirementCheck = (age >= minAge && contriYears >= minContriYears) || (contriYears >= minContriYears);

        if (retirementCheck) {
            System.out.println("Parabéns! Você já pode se aposentar.");
        } else {
            missingAge = Math.max(0, minAge - age);
            missingContriYears = Math.max(0, minContriYears - contriYears);

            System.out.println("Você ainda não pode se aposentar.");
            System.out.println("Faltam:");
            System.out.println("- " + missingAge + " anos para atingir a idade mínima.");
            System.out.println("- " + missingContriYears + " anos de contribuição.");
        }

        scanner.close();
    }
}