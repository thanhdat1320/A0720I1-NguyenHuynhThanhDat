package b3_array_method.Bai_Tap;

public class AddUpArray {
    public static void main(String[] args) {
        int[] arr_1 = {1,2,3,4,5};
        int[] arr_2 = {10,11,12,12,13,14};

        addUpArray(arr_1, arr_2);
    }

    public static void addUpArray(int[] array_1, int[] array_2) {
        int [] array_3 = new int[array_1.length + array_2.length];

            for (int i = 0; i < array_1.length; i++) {
                array_3[i] = array_1[i];
            }
            for (int i = 0; i < array_2.length; i++) {
                array_3[array_1.length + i] = array_2[i];
            }

            for (int i = 0; i < array_3.length; i++) {
                System.out.print(array_3[i] + "\t");
            }
        }
}
