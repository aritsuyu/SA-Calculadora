package Engine.Formulas;

import java.util.Scanner;

public class juroscompostos {
    public static void executar(Scanner scanner) {
        System.out.println("=== Cálculo de Juros Compostos ===");

        System.out.print("Digite o capital inicial (P): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (%) ao período: ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o número de períodos (n): ");
        int periodos = scanner.nextInt();

        double i = taxa / 100; // convertendo taxa para decimal

        double montante = capital * Math.pow(1 + i, periodos);
        double juros = montante - capital;

        System.out.println("Montante (M) = " + montante);
        System.out.println("Juros (J = M - P) = " + juros);
    }
}
