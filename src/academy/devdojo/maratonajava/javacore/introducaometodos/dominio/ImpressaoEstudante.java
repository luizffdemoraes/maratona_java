package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class ImpressaoEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
