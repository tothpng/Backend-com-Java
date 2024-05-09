import java.util.Scanner;

public class Contador {
	/**
	 * Método main: classe principal do programa
	 * @param args - argumentos passados pelo terminal
	 */
	public static void main(String[] args) {
		try {
			try (//criar um objeto Scanner para ler dados do terminal
            Scanner terminal = new Scanner(System.in)) {
                //imprimir uma mensagem no console para o usuário
                System.out.print("Digite o primeiro parâmetro: ");
                
                //lendo o primeiro parâmetro digitado pelo usuário
                int primeiroParametro = terminal.nextInt();
                
                //imprimir uma mensagem no console para o usuário
                System.out.print("Digite o segundo parâmetro: ");
                
                //lendo o segundo parâmetro digitado pelo usuário
                int segundoParametro = terminal.nextInt();
                
                //chamando o método contendo a lógica de contagem
                ParametrosInvalidosException.contar(primeiroParametro, segundoParametro);
            }
			
		//se ocorrer uma exceção, imprimir a mensagem abaixo
		} catch (final ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}
