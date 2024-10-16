public class atv3 {
    public static void main(String[] args) {
        // Calcula a média de três notas
        double nota1 = 8.5;
        double nota2 = 7.3;
        double nota3 = 9.2;
        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média é: " + media);

        situacaoDoAluno(media);

        // Calculo da área de um círculo
        double raio = 5.0;
        double area = areaCirculo(raio);
        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }


    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }


    public static void situacaoDoAluno (double media){
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }


    public static double areaCirculo(double raio){
        return Math.PI * raio * raio;
    }
}
