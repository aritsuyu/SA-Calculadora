package Engine.Formulas;

import java.util.Scanner;

public class trabalho {
    public static void executar(Scanner scanner) {
        System.out.println("=== Trabalho da Força (T = F.d) ===");

        System.out.print("Digite a força (F): ");
        double f = scanner.nextDouble();

        System.out.print("Digite a distância (d): ");
        double d = scanner.nextDouble();

        double t = f * d;
        System.out.println("Trabalho (T) = " + t + " J");
    }
}
