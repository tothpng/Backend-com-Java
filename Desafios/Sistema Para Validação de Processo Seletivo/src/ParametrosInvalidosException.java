
public class ParametrosInvalidosException extends IllegalArgumentException {

    /**
     * Construtor da exceção
     */
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    /**
     * Método contar: realiza a contagem de acordo com os parâmetros
     * @param parametroUm - valor inicial da contagem
     * @param parametroDois - valor final da contagem
     * @throws ParametrosInvalidosException - lança exceção caso o segundo parâmetro seja menor que o primeiro
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        //realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }

}

