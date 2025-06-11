package Engine.Basica;

public class divisao {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Divisão ===");
        
        System.out.print("Digite o dividendo: ");
        double dividendo = scanner.nextDouble();
        
        System.out.print("Digite o divisor: ");
        double divisor = scanner.nextDouble();
        
        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("A divisão de " + dividendo + " por " + divisor + " é: " + resultado);
        }
        
        scanner.close();
    }
    
}
