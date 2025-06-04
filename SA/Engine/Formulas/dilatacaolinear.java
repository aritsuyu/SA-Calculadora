package Engine.Formulas;

import java.util.Scanner;

public class dilatacaolinear {
    public static void executar(Scanner scanner) {
        System.out.println("=== Dilatação Linear (ΔL = L0.α.ΔT) ===");

        System.out.print("Digite o comprimento inicial (L0): ");
        double l0 = scanner.nextDouble();

        System.out.print("Digite o coeficiente de dilatação linear (α): ");
        double alfa = scanner.nextDouble();

        System.out.print("Digite a variação de temperatura (ΔT): ");
        double deltaT = scanner.nextDouble();

        double deltaL = l0 * alfa * deltaT;
        System.out.println("A variação no comprimento (ΔL) é: " + deltaL);
    }
}
