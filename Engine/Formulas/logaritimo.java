package Engine.Formulas;

import java.util.Scanner;

public class logaritimo {
    public static void executar(Scanner scanner) {
        System.out.println("=== Função Logarítmica (f(x) = log_b(x)) ===");

        System.out.print("Digite o valor de x (x > 0): ");
        double x = scanner.nextDouble();

        if (x <= 0) {
            System.out.println("Valor inválido. x deve ser maior que 0.");
            return;
        }

        System.out.print("Digite a base b (b > 0 e b ≠ 1): ");
        double b = scanner.nextDouble();

        if (b <= 0 || b == 1) {
            System.out.println("Base inválida. A base deve ser maior que 0 e diferente de 1.");
            return;
        }

        double resultado = Math.log(x) / Math.log(b);

        System.out.println("log_" + b + "(" + x + ") = " + resultado);
    }
}
