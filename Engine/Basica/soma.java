package Engine.Basica;

public class soma {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Soma ===");
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = num1 + num2;
        
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
        
        scanner.close();
    }
}
