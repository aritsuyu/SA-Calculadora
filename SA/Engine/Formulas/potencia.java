package Engine.Formulas;

import java.util.Scanner;

public class potencia {
    public static void executar(Scanner scanner) {
        System.out.println("=== Potência (P = E / t) ===");

        System.out.print("Digite a energia (E): ");
        double e = scanner.nextDouble();

        System.out.print("Digite o tempo (t): ");
        double t = scanner.nextDouble();

        double p = e / t;
        System.out.println("Potência (P) = " + p + " W");
    }
}
