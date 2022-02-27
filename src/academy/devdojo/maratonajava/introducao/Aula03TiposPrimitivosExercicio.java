package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variávei para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Vegeta";
        String endereco = "Rua Coronel Valadaris 1000, Bairro Sertãozinho, Suzancity - SP";
        double salario = 2500.00;
        String data = "22-02-2022";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " , na data " + data;
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",");
        System.out.println("confirmo que recebi o salário de " + salario + ", na data " + data);
        System.out.println(relatorio);

    }


}
