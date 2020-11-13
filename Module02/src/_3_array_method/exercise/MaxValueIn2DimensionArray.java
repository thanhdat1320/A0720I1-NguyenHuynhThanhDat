package _3_array_method.exercise;

public class MaxValueIn2DimensionArray {

    public static void main(String[] args) {

        int[][] array = {{1,2,3}, {7,8,9}};

        maxValue2Dimension(array);
    }

    public static void maxValue2Dimension(int[][] array) {
        int max = array[0][0];
        int indexX = 0, indexY = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }
        System.out.println("Value: " + max);
        System.out.print("ordinateX: " + indexX + "\n" + "ordinateY: " + indexY);
    }
}
