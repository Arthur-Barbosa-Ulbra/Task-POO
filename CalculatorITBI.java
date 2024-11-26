import javax.swing.JOptionPane;

public class CalculatorITBI {
    public static void main(String[] args) {
        try {
            String tranValueStr, venalValueStr, taxPercentStr, finalMessage;
            double tranValue, venalValue, taxValue;
            double calcule, taxCalcule;

            tranValueStr = JOptionPane.showInputDialog(null,
                    "Digite o valor do imóvel:", "Calculadora de ITBI",
                    JOptionPane.QUESTION_MESSAGE);
            tranValue = Double.parseDouble(tranValueStr);

            venalValueStr = JOptionPane.showInputDialog(null,
                    "Digite o valor venal do imóvel:", "Calculadora de ITBI",
                    JOptionPane.QUESTION_MESSAGE);
            venalValue = Double.parseDouble(venalValueStr);

            taxPercentStr = JOptionPane.showInputDialog(null,
                    "Digite a porcentagem do ITBI (%):", "Calculadora de ITBI",
                    JOptionPane.QUESTION_MESSAGE);
            taxValue = Double.parseDouble(taxPercentStr);

            calcule = Math.max(tranValue, venalValue);
            taxCalcule = (calcule * taxValue) / 100;

            finalMessage = String.format(
                    "Base de cálculo: R$ %.2f\n" +
                            "Porcentagem do imposto: %.2f%%\n" +
                            "Valor do ITBI: R$ %.2f",
                    calcule, taxValue, taxCalcule);

            JOptionPane.showMessageDialog(null,
                    finalMessage, "Resultado do ITBI",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: Insira apenas números válidos.",
                    "Erro de Entrada",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
