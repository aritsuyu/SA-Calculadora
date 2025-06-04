package Engine.Formulas;

import java.util.Scanner;

public class distancia {
    public static void executar(Scanner scanner) {
        System.out.println("=== Distância (S = S0 + vt) ===");

        System.out.print("Digite a posição inicial (S0): ");
        double s0 = scanner.nextDouble();

        System.out.print("Digite a velocidade (v): ");
        double v = scanner.nextDouble();

        System.out.print("Digite o tempo (t): ");
        double t = scanner.nextDouble();

        double s = s0 + v * t;
        System.out.println("A posição final (S) é: " + s);
    }
}
