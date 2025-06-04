package Engine.Formulas;

import java.util.Scanner;

public class exponencial {
    public static void executar(Scanner scanner) {
        System.out.println("=== Função Exponencial (f(x) = a · b^x) ===");

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a base b (b > 0 e b ≠ 1): ");
        double b = scanner.nextDouble();

        if (b <= 0 || b == 1) {
            System.out.println("Base inválida. A base deve ser maior que 0 e diferente de 1.");
            return;
        }

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double fx = a * Math.pow(b, x);

        System.out.println("f(" + x + ") = " + fx);
    }
}
