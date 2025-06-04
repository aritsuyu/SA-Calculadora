package Engine.Formulas;

import java.util.Scanner;

public class equacao1grau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fórmula da Equação de 1 Grau ===");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 1º grau (a não pode ser zero).");
            return;
        }

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        // A equação é da forma ax + b = 0
        // Resolvendo para x: x = -b / a
        double x = -b / a;
        System.out.println("A solução da equação " + a + "x " + (b >= 0 ? "+ " + b : "- " + (-b)) + " = 0 é: x = " + x);
        scanner.close();
    }
}
