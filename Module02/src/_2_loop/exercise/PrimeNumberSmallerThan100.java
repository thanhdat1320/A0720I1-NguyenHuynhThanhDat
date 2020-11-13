package _2_loop.exercise;

public class PrimeNumberSmallerThan100 {

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int listNumber[] = new int[30];
        int number = 2;
        int count = 0;
        while (number < 100) {
            if (isPrime(number)) {
                listNumber[count] = number;
                count++;
            }
            number++;
        }

        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + "\t");
        }
    }
}
