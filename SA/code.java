import java.util.Scanner;

import Engine.Formulas.calorlatente;
public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU DE FÓRMULAS =====");
             System.out.println("\n===== Matemática =====");
             System.out.println("1  - Equação do 1º grau");
             System.out.println("2  - Equação do 2º grau (Bhaskara)");
             System.out.println("3  - Fórmula do Delta");
             System.out.println("4  - Progressão Aritmética (PA)");
             System.out.println("5  - Progressão Geométrica (PG)");
             System.out.println("6  - Função Exponencial");
             System.out.println("7  - Função Logarítmica");
             System.out.println("8  - Porcentagem");
             System.out.println("9  - Juros Simples");
             System.out.println("10 - Juros Compostos");
            System.out.println("\n===== Física =====");
             System.out.println("11 - Movimento Retilíneo Uniforme (MRU)");
             System.out.println("12 - Movimento Uniformemente Variado (MRUV)");
             System.out.println("13 - Equação de Torricelli");
             System.out.println("14 - Velocidade final (v = v0 + at)");
             System.out.println("15 - Distância (S = S0 + vt)");
             System.out.println("16 - Energia Cinética (Ec = m.v² / 2)");
             System.out.println("17 - 2ª Lei de Newton (F = m.a)");
             System.out.println("18 - Trabalho da força (T = F.d)");
             System.out.println("19 - Potência (P = E / t)");
             System.out.println("20 - Pressão (P = F / A)");
             System.out.println("21 - Dilatação térmica linear (ΔL = L0.α.ΔT)");
             System.out.println("22 - Calor sensível (Q = m.c.ΔT)");
             System.out.println("23 - Calor latente (Q = m.L)");
            System.out.println("\n===== Química =====");
             System.out.println("24 - Concentração comum (C = m / V)");
             System.out.println("25 - Densidade (d = m / V)");
             System.out.println("26 - Número de mols (n = m / M)");
             System.out.println("27 - Lei de Avogadro (n = N / NA)");
             System.out.println("28 - Lei dos Gases (PV = nRT)");
            System.out.println("\n===== Geral =====");
             System.out.println("0 - Sair");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Engine.Formulas.equacao1grau.executar(scanner);
                    break;
                case 2:
                    Engine.Formulas.baskhara.executar(scanner);
                    break;
                case 3:
                    Engine.Formulas.delta.executar(scanner);
                    break;
                case 4:
                    Engine.Formulas.pa.executar(scanner);
                    break;
                case 5:
                    Engine.Formulas.pg.executar(scanner);
                    break;
                case 6:
                    Engine.Formulas.exponencial.executar(scanner);
                    break;
                case 7:
                    Engine.Formulas.logaritimo.executar(scanner);
                    break;
                case 8:
                    Engine.Formulas.porcentagem.executar(scanner);
                    break;
                case 9:
                    Engine.Formulas.jurosimples.executar(scanner);
                    break;
                case 10:
                    Engine.Formulas.juroscompostos.executar(scanner);
                    break;
                case 11:
                    Engine.Formulas.mru.executar(scanner);
                    break;
                case 12:
                    Engine.Formulas.mruv.executar(scanner);
                    break;
                case 13:
                    Engine.Formulas.torricelli.executar(scanner);
                    break;
                case 14:
                    Engine.Formulas.velocidadefinal.executar(scanner);
                    break;
                case 15:
                    Engine.Formulas.distancia.executar(scanner);
                    break;
                case 16:
                    Engine.Formulas.energiaCinetica.executar(scanner);
                    break;
                case 17:
                    Engine.Formulas.segundaleinewton.executar(scanner);
                    break;
                case 18:
                    Engine.Formulas.trabalho.executar(scanner);
                    break;
                case 19:
                    Engine.Formulas.potencia.executar(scanner);
                    break;
                case 20:
                    Engine.Formulas.pressao.executar(scanner);
                    break;
                case 21:
                    Engine.Formulas.dilatacaolinear.executar(scanner);
                    break;
                case 22:
                    Engine.Formulas.calorsensivel.executar(scanner);
                    break;
                case 23:
                    calorlatente.executar(scanner);
                    break;
                case 24:
                    Engine.Formulas.concetracaocomun.executar(scanner);
                    break;
                case 25:
                    Engine.Formulas.densidade.executar(scanner);
                    break;
                case 26:
                    Engine.Formulas.numeromols.executar(scanner);
                    break;
                case 27:
                    Engine.Formulas.leiavagadro.executar(scanner);
                    break;
                case 28:
                    Engine.Formulas.leigases.executar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;}
            if (choice != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
                scanner.nextLine();
            }
        } while (choice != 0);
        scanner.close();
    }
}