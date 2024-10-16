public class atv2 {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        System.out.println("Números primos até 50:");
        exibirNumerosPrimos(50);
    }

    // Função para calcular o fatorial de um número
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // Função para exibir números primos até um determinado limite
    public static void exibirNumerosPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}