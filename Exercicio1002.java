import java.util.Scanner;

public class Exercicio1002 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            
            double area = 3.14159 * Math.pow(a, 2);
            
            System.out.printf("A=%.4f%n", area);
        }
    }
}
