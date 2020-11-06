package b2_loop.exercise;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberList[] = new int[20];
        int count = 0;
        int number = 2;
        while (count < 20) {
            if (isPrime(number)) {
                numberList[count] = number;
                count++;
            }
            number++;
        }

        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + "\t");
        }
    }
}

