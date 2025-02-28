package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        int[][] arrInt = new int[8][];

        arrInt[0] = new int[2];
        arrInt[1] = new int[3];
        arrInt[2] = new int[5];
        arrInt[3] = new int[6];
        arrInt[4] = new int[5];
        arrInt[5] = new int[4];
        arrInt[6] = new int[3];
        arrInt[7] = new int[2];

        for (int[] arrbase : arrInt) {
            System.out.println("\n -----------------------");
            for (int num : arrbase) {
                System.out.print(num);
            }
        }
    }
}
