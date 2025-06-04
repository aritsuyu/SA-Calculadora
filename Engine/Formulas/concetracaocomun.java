package Engine.Formulas;

import java.util.Scanner;

public class concetracaocomun {
    public static void executar(Scanner scanner) {
        System.out.println("=== Concentração Comum (C = m / V) ===");

        System.out.print("Digite a massa do soluto (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite o volume da solução (V): ");
        double v = scanner.nextDouble();

        double c = m / v;
        System.out.println("Concentração comum (C) = " + c + " g/L");
    }
}
