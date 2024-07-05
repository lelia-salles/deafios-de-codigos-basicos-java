import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                double limiteDiario = scanner.nextDouble();
                double saldo = 0;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else  {
                
                //Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                saldo -=valorSaque;
                System.out.printf("Saque realizado com sucesso. Saldo atual: %.2f\n", saldo);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}