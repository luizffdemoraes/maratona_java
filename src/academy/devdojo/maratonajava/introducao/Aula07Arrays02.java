package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        byte, short, int, long, float e double 0
        char "\u000"
        boolean false
        String null
         */


        String[] nomes = new String[4]; // Tipo reference
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[2] = "Hinata";

        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }
    }
}
