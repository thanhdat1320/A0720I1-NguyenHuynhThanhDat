package b3_array_method.exercise;

public class SumDiagonal2DimensionArray {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {5,6,7}, {0,1,2}};

        System.out.println("Sum: " + sumDiagonal(arr));
    }

    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
