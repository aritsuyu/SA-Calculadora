package Engine.Basica;

public class potencia {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Potência ===");
        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();
        
        double resultado = Math.pow(base, expoente);
        
        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);
        
        scanner.close();
    }
}
