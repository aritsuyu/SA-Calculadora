package Engine.Formulas;

import java.util.Scanner;

public class leiavagadro {
    public static void executar(Scanner scanner) {
        System.out.println("=== Lei de Avogadro (n = N / NA) ===");

        System.out.print("Digite o número de partículas (N): ");
        double N = scanner.nextDouble();

        final double NA = 6.022e23;

        double n = N / NA;
        System.out.println("Número de mols (n) = " + n);
    }
}
