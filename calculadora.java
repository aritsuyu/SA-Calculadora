import java.util.Scanner;
import Lib.index;
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        index.menu(scanner);
        scanner.close();
    }
}
