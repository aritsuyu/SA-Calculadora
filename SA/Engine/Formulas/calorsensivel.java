package Engine.Formulas;

import java.util.Scanner;

public class calorsensivel {
    public static void executar(Scanner scanner) {
        System.out.println("=== Calor Sensível (Q = m.c.ΔT) ===");

        System.out.print("Digite a massa (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite o calor específico (c): ");
        double c = scanner.nextDouble();

        System.out.print("Digite a variação de temperatura (ΔT): ");
        double deltaT = scanner.nextDouble();

        double q = m * c * deltaT;
        System.out.println("Calor sensível (Q) = " + q + " cal");
    }
}
