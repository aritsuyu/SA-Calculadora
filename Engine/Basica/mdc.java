package Engine.Basica;

public class mdc {
    public static void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== Cálculo do Máximo Divisor Comum (MDC) ===");
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int mdc = calcularMDC(num1, num2);
        
        System.out.println("O máximo divisor comum de " + num1 + " e " + num2 + " é: " + mdc);
        
        scanner.close();
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
