package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[][] idade = new int[3][3];
        idade[0][0] = 32;
        idade[0][1] = 33;
        idade[0][2] = 34;

        idade[1][0] = 22;
        idade[1][1] = 23;
        idade[1][2] = 24;

        idade[2][0] = 12;
        idade[2][1] = 13;
        idade[2][2] = 14;

        for (int i = 0; i < idade.length; i++) {
            for (int j = 0; j < idade[i].length; j++) {
                System.out.println(idade[i][j]);
            }
        }

        System.out.println("-----------------------------------------");

        for(int[] arrbase : idade){
            for(int num : arrbase){
                System.out.println(num);
            }
        }
    }
}
