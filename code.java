import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEscolha qual fórmula você quer usar:");
            System.out.println("1 - Fórmula de Bhaskara");
            System.out.println("2 - Fórmula da Equação do 1º grau");
            System.out.println("3 - Fórmula da Equação do 2º grau");
            System.out.println("4 - Fórmula do Delta");
            System.out.println("5 - Para calcular PA");
            System.out.println("6 - Para calcular PG");
            System.out.println("7 - Fórmula da distância percorrida (S = S0 + vt)");
            System.out.println("8 - Conversão de unidades de distância (km para m, m para cm, etc)");
            System.out.println("9 - Fórmula do MRU (S = S0 + vt)");
            System.out.println("10 - Fórmula do MRUV (S = S0 + v0t + at²/2)");
            System.out.println("11 - Fórmula da velocidade final (v = v0 + at)");
            System.out.println("12 - Fórmula de Torricelli (v² = v0² + 2aΔS)");
            System.out.println("13 - Fórmula da 2ª Lei de Newton (F = m.a)");
            System.out.println("14 - Fórmula da Concentração comum (C = m / V)");
            System.out.println("15 - Fórmula da Densidade (d = m / V)");
            System.out.println("16 - Fórmula da Pressão (P = F / A)");
            System.out.println("17 - Fórmula da Energia Cinética (Ec = m.v²/2)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Engine.Formulas.baskhara.executar(scanner);                        
                        scanner.nextLine();
                switch (choice) {
                    case 2:
                        Engine.Formulas.equacao1grau.main(new String[]{});
                        scanner.nextLine();
                        System.out.println("\nPressione ENTER para voltar ao menu...");
                        scanner.nextLine();
                        break;
                }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                if (choice >= 0)
                        System.out.println("\nPressione ENTER para voltar ao menu...");
                        scanner.nextLine();
                        
        } while (choice != 0);
        scanner.close();
    }
}
