package Engine.Formulas;

import java.util.Scanner;

public class delta {
    public static void executar(Scanner scanner) {
        System.out.println("=== Cálculo do Delta (Δ = b² - 4ac) ===");

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Δ = " + delta);
    }
}
