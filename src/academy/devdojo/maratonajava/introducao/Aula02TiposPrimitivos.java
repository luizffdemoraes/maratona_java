package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 1000000000L;
        long numeroGrande = (long) 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D; //2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 67;
        char caracter = '\u0041';
        String nome = "Goku";
        var nome2 = "Vegeta";
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é "+nome);
    }
}
