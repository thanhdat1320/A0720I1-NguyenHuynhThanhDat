package _11_DSA_stark_queue.optional.convert_number;

import java.util.Stack;

public class Decimal {
    private int value = 0;

    public Decimal() {
    }

    public Decimal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Binary toBinary() {
        Stack<Integer> binaryList =  new Stack<>();
        int decimal = this.value;
        String result = "";

        while (decimal > 0) {
            binaryList.push(decimal % 2);
            decimal /= 2;
        }

        while (!binaryList.isEmpty()) {
            result += result.concat(String.valueOf(binaryList.pop()));
        }

        Binary resultBinary = new Binary(result);
        return resultBinary;
    }

    public Hexadecimal toHex() {
        String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Stack<String> hexList = new Stack<>();
        int decimal = this.value;
        String result = "";

        while (decimal > 0) {
            hexList.push(hexArray[decimal % 16]);
            decimal /= 16;
        }

        while (!hexList.isEmpty()) {
            result += result.concat(String.valueOf(hexList.pop()));
        }

        Hexadecimal resultHex = new Hexadecimal(result);
        return resultHex;
    }
}
