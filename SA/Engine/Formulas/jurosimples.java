package Engine.Formulas;

import java.util.Scanner;

public class jurosimples {
    public static void executar(Scanner scanner) {
        System.out.println("=== Cálculo de Juros Simples ===");

        System.out.print("Digite o capital inicial (P): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (%) ao período: ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o tempo (t): ");
        double tempo = scanner.nextDouble();

        // Convertendo taxa para decimal
        double i = taxa / 100;

        double juros = capital * i * tempo;
        double montante = capital + juros;

        System.out.println("Juros (J) = " + juros);
        System.out.println("Montante (M = P + J) = " + montante);
    }
}
