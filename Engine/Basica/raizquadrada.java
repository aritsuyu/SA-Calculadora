package Engine.Basica;

public class raizquadrada {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Raiz Quadrada ===");
        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero < 0) {
            System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
        } else {
            double resultado = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        }
        
        scanner.close();
    }

}
