package Engine.Basica;

public class mmc {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo de Mínimo Múltiplo Comum (MMC) ===");
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int mmc = calcularMMC(num1, num2);
        
        System.out.println("O Mínimo Múltiplo Comum de " + num1 + " e " + num2 + " é: " + mmc);
        
        scanner.close();
    }
    
    private static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }
    
    private static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
