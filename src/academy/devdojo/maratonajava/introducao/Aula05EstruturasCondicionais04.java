package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //    € 0	    € 35,129	 9.45%
    //    € 35,130	€ 68,507	37.10%
    //    € 68,508		        49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto;

//        if (salarioAnual <= 35130) {
//            salarioAnual *= primeiraFaixa;
//        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
//            salarioAnual *= segundaFaixa;
//        } else {
//            salarioAnual *= terceiraFaixa;
//        }

        valorImposto = salarioAnual <= 35130 ? (salarioAnual * primeiraFaixa) : salarioAnual <= 68507 ? (salarioAnual * segundaFaixa) : (salarioAnual * terceiraFaixa);

        System.out.println(valorImposto);
    }
}
