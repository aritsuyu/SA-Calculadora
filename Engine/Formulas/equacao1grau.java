package Engine.Formulas;

import java.util.Scanner;

public class equacao1grau {
    public static void executar(Scanner scanner) {

        System.out.println("=== Fórmula da Equação de 1º Grau ===");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 1º grau (a não pode ser zero).");
            return;
        }

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        double x = -b / a;

        System.out.println("A solução da equação " + a + "x " + (b >= 0 ? "+ " + b : "- " + (-b)) + " = 0 é: x = " + x);
        // scanner.close();  <-- Removido! Nunca feche o Scanner que foi passado por parâmetro se o programa ainda vai usá-lo
    }
}
