package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Arrays de Arrays são linkados onde você pode navegar entre todos eles
        // 1 - Array 1,2,3,4,5 Meses
        // 2 - Dias 31, 28, 31, 30, dias
        // Precisa definir o tamanho da primeira parte.
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println(dias[0][0]);
    }
}
