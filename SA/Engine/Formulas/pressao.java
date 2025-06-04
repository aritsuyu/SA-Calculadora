package Engine.Formulas;

import java.util.Scanner;

public class pressao {
    public static void executar(Scanner scanner) {
        System.out.println("=== Pressão (P = F / A) ===");

        System.out.print("Digite a força (F): ");
        double f = scanner.nextDouble();

        System.out.print("Digite a área (A): ");
        double a = scanner.nextDouble();

        double p = f / a;
        System.out.println("Pressão (P) = " + p + " Pa");
    }
}
