package Engine.Formulas;

import java.util.Scanner;

public class energiaCinetica {
    public static void executar(Scanner scanner) {
        System.out.println("=== Energia Cinética (Ec = m.v² / 2) ===");

        System.out.print("Digite a massa (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite a velocidade (v): ");
        double v = scanner.nextDouble();

        double ec = (m * Math.pow(v, 2)) / 2;
        System.out.println("Energia Cinética = " + ec + " J");
    }
}
