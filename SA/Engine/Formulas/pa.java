package Engine.Formulas;

import java.util.Scanner;

public class pa {
    public static void executar(Scanner scanner) {
        System.out.println("=== Progressão Aritmética (PA) ===");

        System.out.print("Digite o 1º termo (a1): ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a razão (r): ");
        double r = scanner.nextDouble();

        System.out.print("Digite a quantidade de termos (n): ");
        int n = scanner.nextInt();

        // Cálculo do enésimo termo
        double an = a1 + (n - 1) * r;

        // Cálculo da soma dos termos
        double soma = (a1 + an) * n / 2;

        System.out.println("n-ésimo termo (an): " + an);
        System.out.println("Soma dos " + n + " primeiros termos (Sn): " + soma);
    }
}
