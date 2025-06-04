package Engine.Formulas;

import java.util.Scanner;

public class porcentagem {
    public static void executar(Scanner scanner) {
        System.out.println("=== Cálculo de Porcentagem ===");

        System.out.print("Digite o valor total: ");
        double total = scanner.nextDouble();

        System.out.print("Digite a porcentagem (%): ");
        double porcentagem = scanner.nextDouble();

        double resultado = (total * porcentagem) / 100;

        System.out.println(porcentagem + "% de " + total + " é: " + resultado);
    }
}
