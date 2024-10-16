public class atv4 {
    public static void main(String[] args) {
        // Converter temperatura de Celsius para Fahrenheit
        double celsius = 25.0;
        double fahrenheit = calculoDeTemperatura(celsius);
        System.out.println(celsius + "°C em Fahrenheit é: " + fahrenheit);

        // Verificar se um número é par ou ímpar
        int numero = 15;
        imparOuPar(numero);

        // Calcular a potência de um número
        int base = 2;
        int expoente = 3;
        int potencia = 1;
        calcularPontencia(base, expoente, potencia);
        System.out.println(base + " elevado a " + expoente + " é: " + potencia);
    }
    public static double calculoDeTemperatura(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void imparOuPar(int numero){
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }

    public static void calcularPontencia(int expoente, int potencia,int base){
        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }
    }
}
