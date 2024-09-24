import java.util.Scanner;

public class Exercicio1011 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double raio = scanner.nextDouble();
            
            double pi = 3.14159;
            
            double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
            
            System.out.printf("VOLUME = %.3f%n", volume);
        }
    }
}