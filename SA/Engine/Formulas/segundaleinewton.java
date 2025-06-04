package Engine.Formulas;

import java.util.Scanner;

public class segundaleinewton {
    public static void executar(Scanner scanner) {
        System.out.println("=== 2ª Lei de Newton (F = m.a) ===");

        System.out.print("Digite a massa (m): ");
        double m = scanner.nextDouble();

        System.out.print("Digite a aceleração (a): ");
        double a = scanner.nextDouble();

        double f = m * a;
        System.out.println("Força resultante (F) = " + f + " N");
    }
}
