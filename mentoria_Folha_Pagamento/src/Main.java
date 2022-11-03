import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe se o colaborador é Vendedor ou Consultor." +
                "\nPara Vendedor Digite 1" +
                "\nPara Consultor Digite 2");
        String escolhaColab = scanner.next();
        int numeroColab = Integer.parseInt(escolhaColab);

        System.out.println("Informe o seu nome aqui: ");
        String nomeColab = scanner.next();
        System.out.println("Informe o seu cpf aqui: ");
        String cpfColab = scanner.next();
        if (numeroColab == 1){
            System.out.println("Vendedor");
        Vendedor nomeVendedor = new Vendedor(nomeColab, cpfColab, 10.0, 5);
        double salarioVendedor = nomeVendedor.calcularSalario();
        System.out.println("O Salario de " + nomeColab + " cpf n. " + cpfColab + " é: " + salarioVendedor);
            }
        else if (numeroColab == 2){
            System.out.println("Consultor");
            Consultor nomeConsulor = new Consultor(nomeColab, cpfColab, 100.0, 10L);
            System.out.println("O Salário de " + nomeColab + " é: " + nomeConsulor.calcularSalario());
        } else
            System.out.println("Número Inválido! Por favor digite 1 ou 2.");
        }
}

