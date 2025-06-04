package Engine.Formulas;

import java.util.Scanner;

public class densidade {
    public static void executar(Scanner scanner) {
        System.out.println("=== Densidade (d = m / V) ===");

        System.out.print("Digite a massa (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite o volume (V): ");
        double v = scanner.nextDouble();

        double d = m / v;
        System.out.println("Densidade (d) = " + d + " g/cm³ ou kg/m³");
    }
}
