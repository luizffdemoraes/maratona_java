package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Palio";
        carro1.modelo = "Fiat";
        carro1.ano = 1997;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.modelo = "Volkswagen";
        carro2.ano = 1997;

        System.out.println("Nome : " + carro1.nome + " Modelo : " + carro1.modelo + " Ano : " + carro1.ano);
        System.out.println("Nome : " + carro2.nome + " Modelo : " + carro2.modelo + " Ano : " + carro2.ano);
    }
}
