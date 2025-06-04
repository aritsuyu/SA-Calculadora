package Engine.Formulas;

import java.util.Scanner;

public class velocidadefinal {
    public static void executar(Scanner scanner) {
        System.out.println("=== Velocidade Final (v = v0 + at) ===");

        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = scanner.nextDouble();

        System.out.print("Digite a aceleração (a): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o tempo (t): ");
        double t = scanner.nextDouble();

        double v = v0 + a * t;
        System.out.println("A velocidade final (v) é: " + v);
    }
}
