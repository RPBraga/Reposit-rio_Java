import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, PROD;
        System.out.println("Informe o primeiro número inteiro: ");
        int num1 = teclado.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int num2 = teclado.nextInt();
        System.out.println("O produto dos números é: " +(num1*num2));
    }
}
