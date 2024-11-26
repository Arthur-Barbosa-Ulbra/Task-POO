import javax.swing.JOptionPane;

public class Avaliation {
        public static void main(String[] args) {
                try {
                        String firstTaskStr, secondTaskStr, testStr, finalMessage;
                        double firstTaskValue, secondTaskValue, testValue;
                        double calcule;

                        firstTaskStr = JOptionPane.showInputDialog(null,
                                        "Digite a nota do primeiro trabalho:", "Notas de Avaliação",
                                        JOptionPane.QUESTION_MESSAGE);
                        firstTaskValue = Double.parseDouble(firstTaskStr);

                        secondTaskStr = JOptionPane.showInputDialog(null,
                                        "Digite a nota do segundo trabalho:", "Notas de Avaliação",
                                        JOptionPane.QUESTION_MESSAGE);
                        secondTaskValue = Double.parseDouble(secondTaskStr);

                        testStr = JOptionPane.showInputDialog(null,
                                        "Digite a nota da prova:", "Notas de Avaliação",
                                        JOptionPane.QUESTION_MESSAGE);
                        testValue = Double.parseDouble(testStr);

                        calcule = (firstTaskValue + secondTaskValue + testValue) / 3;

                        if (calcule >= 6) {
                                finalMessage = String.format("Nota final %.2f:\n" +
                                                "Aluno aprovado!!", calcule);
                        } else {
                                finalMessage = String.format("Nota final %.2f:\n" +
                                                "Aluno reprovado...", calcule);
                        }

                        JOptionPane.showMessageDialog(null,
                                        finalMessage, "Resultado da Avaliação",
                                        JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                        "Erro: Insira apenas números válidos.",
                                        "Erro de Entrada",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }
}
