import java.util.Scanner;

public class ControleSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o limite diário de saque ao usuário
        System.out.print("Digite o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Inicializar o saldo com 0
        double saldo = 0;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            // Solicitar o valor do saque ao usuário
           
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // Atualizar o saldo e imprimir a saída no formato dos exemplos.
                saldo = limiteDiario - valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", saldo);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
