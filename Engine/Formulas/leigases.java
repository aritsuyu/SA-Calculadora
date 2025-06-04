package Engine.Formulas;

import java.util.Scanner;

public class leigases {
    public static void executar(Scanner scanner) {
        System.out.println("=== Lei dos Gases (PV = nRT) ===");

        System.out.print("Digite o número de mols (n): ");
        double n = scanner.nextDouble();

        System.out.print("Digite a constante dos gases (R): ");
        double R = scanner.nextDouble();

        System.out.print("Digite a temperatura (T): ");
        double T = scanner.nextDouble();

        double PV = n * R * T;
        System.out.println("O produto pressão × volume (PV) = " + PV);
    }
}
