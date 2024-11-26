import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CORRECT_USERNAME = "java8";
        final String CORRECT_PASSWORD = "java8";
        int remainingAttempts = 3;
        boolean accessGranted = false;
        String username, password;

        System.out.println("Welcome to the system. Please enter your login credentials.");

        // Loop until the user either succeeds or exhausts their attempts
        while (remainingAttempts > 0 && !accessGranted) {
            System.out.print("Digite o nome de usuário: ");
            username = scanner.nextLine();

            System.out.print("Digite a senha: ");
            password = scanner.nextLine();

            // Check if the username and password match the correct values
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                accessGranted = true;
                System.out.println("Acesso permitido! Bem-vindo(a).");
            } else {
                remainingAttempts--;
                if (remainingAttempts > 0) {
                    System.out.println("Nome de usuário ou senha incorretos. Você tem " + remainingAttempts
                            + " tentativa(s) disponíveis.");
                } else {
                    System.out.println("Acesso negado. Você não possui nenhuma tentativa restante.");
                }
            }
        }

        scanner.close();
    }
}