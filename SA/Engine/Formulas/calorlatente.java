package Engine.Formulas;

import java.util.Scanner;

public class calorlatente {
    public static void executar(Scanner scanner) {
        System.out.println("=== Calor Latente (Q = m.L) ===");

        System.out.print("Digite a massa (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite o calor latente (L): ");
        double l = scanner.nextDouble();

        double q = m * l;
        System.out.println("Calor latente (Q) = " + q + " cal");
    }
}
