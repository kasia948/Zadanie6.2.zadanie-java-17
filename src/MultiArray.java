import java.util.Random;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array;

        Random rand = new Random();
        int N = rand.nextInt(10);
        int M = rand.nextInt(10);
        System.out.println(N);
        System.out.println(M);

        int[][] array1 = new int[N][M];
        for (int i = 0; i < N && i < M; i++) {
            for (int j = 0; j < N && i < M; j++) {
                array1[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < N && i < M; i++) {
            for (int j = 0; j < N && i < M; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] randomize(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                Random rand = new Random();
                array1[i][j] = rand.nextInt(10);
            }
        }
        return array1;
    }

    public void print(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findMax(int[][] array1) {
        int max = array1[0][0];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j] > max)
                    max = array1[i][j];
            }
        }
        System.out.println("Największa wartość tablicy to "+max);
    }

    public void findMin(int[][] array1) {
        int min = array1[0][0];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j] < min)
                    min = array1[i][j];
            }
        }
        System.out.println("Najmniejsza wartość tablicy to "+min);
    }
}
