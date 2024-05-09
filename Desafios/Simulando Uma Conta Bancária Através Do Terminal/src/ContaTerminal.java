import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Criando conta poupança

        Scanner options = new Scanner(System.in);

        System.out.println("Criando conta poupança");
        System.out.println("\n");
        
        System.out.println("Por favor, informe as seguintes informações: ");

        System.out.println("Qual seu nome?");
        String accountName = options.nextLine();
        System.out.println("Qual o numero da agencia?");
        String accountAgency = options.nextLine();
        System.out.println("Qual o numero da conta?");
        String accountNumber = options.nextLine();
        
        double accountBalance = 0.0;
        String accountType = "Poupança";

        // Variáveis

        int selected = 0;
        double value = 0.0;
        @SuppressWarnings("unused")
        String accountTypeTransfer = "";

        while (selected != 5) {

            // Mostrar informações

            System.out.println("Bem vindo(a) ao seu terminal de conta!");
            System.out.println("\n");

            System.out.println("Nome: " + accountName);
            System.out.println("Agencia: " + accountAgency);
            System.out.println("Conta: " + accountNumber);
            System.out.println("Tipo: " + accountType);

            System.out.println("\n");

            // Menu

            System.out.println("Selecione uma opção: ");
            System.out.println("\n");

            System.err.println("1 - Verificar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");

            selected = options.nextInt();
            System.out.println("\n");
            
            switch (selected) {

                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    System.out.println("Seu saldo atual é: " + accountBalance);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    value = options.nextDouble();
                    accountBalance += value;
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    value = options.nextDouble();
                    if (value <= accountBalance) {
                        accountBalance -= value;
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Quanto deseja transferir?");
                    value = options.nextDouble();
                    if (value <= accountBalance) {
                        accountBalance -= value;
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        }

        options.close();

        // Fim

        System.out.println("Obrigado por utilizar nosso sistema!");
    }
}
