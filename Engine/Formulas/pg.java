package Engine.Formulas;

import java.util.Scanner;

public class pg {
    public static void executar(Scanner scanner) {
        System.out.println("=== Progressão Geométrica (PG) ===");

        System.out.print("Digite o 1º termo (a1): ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a razão (q): ");
        double q = scanner.nextDouble();

        System.out.print("Digite a quantidade de termos (n): ");
        int n = scanner.nextInt();

        double an = a1 * Math.pow(q, n - 1);

        double soma;
        if (q == 1) {
            soma = a1 * n;
        } else {
            soma = a1 * (Math.pow(q, n) - 1) / (q - 1);
        }
        System.out.println("n-ésimo termo (an): " + an);
        System.out.println("Soma dos " + n + " primeiros termos (Sn): " + soma);
    }
}
