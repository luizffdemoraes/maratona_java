package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizaComprarBebida = idade >= 18;
        // !
        if (isAutorizaComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizaComprarBebida ) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = false;
        if(c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
