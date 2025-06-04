package Engine.Formulas;

import java.util.Scanner;

public class numeromols {
    public static void executar(Scanner scanner) {
        System.out.println("=== Número de mols (n = m / M) ===");

        System.out.print("Digite a massa da substância (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite a massa molar (M): ");
        double M = scanner.nextDouble();

        double n = m / M;
        System.out.println("Número de mols (n) = " + n);
    }
}
