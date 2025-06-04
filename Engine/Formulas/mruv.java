package Engine.Formulas;

import java.util.Scanner;

public class mruv {
    public static void executar(Scanner scanner) {
        System.out.println("=== MRUV (S = S0 + v0t + at²/2) ===");

        System.out.print("Digite a posição inicial (S0): ");
        double s0 = scanner.nextDouble();

        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = scanner.nextDouble();

        System.out.print("Digite o tempo (t): ");
        double t = scanner.nextDouble();

        System.out.print("Digite a aceleração (a): ");
        double a = scanner.nextDouble();

        double s = s0 + v0 * t + (a * Math.pow(t, 2)) / 2;
        System.out.println("A posição final (S) é: " + s);
    }
}
