package Engine.Formulas;

import java.util.Scanner;

public class torricelli {
    public static void executar(Scanner scanner) {
        System.out.println("=== Equação de Torricelli (v² = v0² + 2aΔS) ===");

        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = scanner.nextDouble();

        System.out.print("Digite a aceleração (a): ");
        double a = scanner.nextDouble();

        System.out.print("Digite a variação de espaço (ΔS): ");
        double deltaS = scanner.nextDouble();

        double v = Math.sqrt(Math.pow(v0, 2) + 2 * a * deltaS);
        System.out.println("A velocidade final (v) é: " + v);
    }
}
