package Engine.Basica;

public class fatorial {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Fatorial ===");
        
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
            scanner.close();
            return;
        }
        
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + resultado);
        
        scanner.close();
    }
}
