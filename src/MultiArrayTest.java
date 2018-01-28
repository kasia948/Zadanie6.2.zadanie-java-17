public class MultiArrayTest {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        MultiArray rand1= new MultiArray();
        rand1.randomize(array);
        rand1.print(array);
        rand1.findMax(array);
        rand1.findMin(array);
    }
}
