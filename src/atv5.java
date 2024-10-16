public class atv5 {
    public static void main(String[] args) {
        // Calcular o IMC de uma pessoa
        double peso = 70.0;  // em kg
        double altura = 1.75;  // em metros
        double imc = calcularIMC(peso, altura);
        System.out.println("O IMC é: " + imc);

        // Classificar o IMC
        classificarImc(imc);

        // Conversão de quilômetros para milhas
        double quilometros = 10.0;
        double milhas = 0;
        conversaoKmParaMilha(quilometros,milhas);
    }



public static double calcularIMC(double peso, double altura) {
        return  peso / (altura * altura);
}



public static void classificarImc(double imc){
    if (imc < 18.5) {
        System.out.println("Abaixo do peso.");
    } else if (imc >= 18.5 && imc < 24.9) {
        System.out.println("Peso normal.");
    } else if (imc >= 25 && imc < 29.9) {
        System.out.println("Sobrepeso.");
    } else {
        System.out.println("Obesidade.");
    }

}


    public static void conversaoKmParaMilha(double quilometros, double milhas){
        milhas = quilometros * 0.621371;
        System.out.println(quilometros + " km é equivalente a " + milhas + " milhas.");
    }

}