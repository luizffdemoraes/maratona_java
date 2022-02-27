package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("=== While ====");
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        // vai executar pelo menos uma vez
        System.out.println("=== Do While ====");
        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        System.out.println("=== For ====");

        // statement
        for (count = 0; count < 10; count++) {
            System.out.println("For " + count);
        }
    }
}
