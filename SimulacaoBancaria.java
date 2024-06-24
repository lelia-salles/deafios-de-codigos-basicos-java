import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        

        while (continuar) {
          
          System.out.print("Escolha uma opção (1, 2, 3 ou 0): ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito; // Atualiza o saldo
                    System.out.println("Depósito realizado. Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque; // Atualiza o saldo
                        System.out.println("Saque realizado. Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para o saque.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
