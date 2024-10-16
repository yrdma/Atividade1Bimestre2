public class atv1 {
    public static void main(String[] args) {
        // Lógica de saudação
        String nome = "Carlos";
        saudacao(nome);

        // Cálculo de soma
        int a = 5;
        int b = 10;
        int soma = calcularSoma(a,b);
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);

        verificacaoParImpar(soma);

}
    // Função para saudação
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }


public static int calcularSoma(int a, int b) {
        return a + b;
}
public static void verificacaoParImpar(int numero) {
    if (numero % 2 == 0) {
        System.out.println(numero + " é par.");
    } else {
        System.out.println(numero + " é ímpar.");

    }


}}