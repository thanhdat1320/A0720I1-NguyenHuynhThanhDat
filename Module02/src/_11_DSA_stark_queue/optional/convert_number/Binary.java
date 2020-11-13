package _11_DSA_stark_queue.optional.convert_number;

import java.util.Stack;

public class Binary {
    private String value = "0";

    public Binary() {
    }

    public Binary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Decimal toBinary() {
        int result = 0;
        int count = 0;
        Stack<String> listDecimal = new Stack<>();

        for (int i = 0; i < value.length(); i++) {
            listDecimal.push(String.valueOf(this.value.charAt(i)));
        }
        while (!listDecimal.isEmpty()) {
            result += Integer.parseInt(listDecimal.pop()) * Math.pow(2, count);
            count++;
        }

        Decimal decimal =  new Decimal(result);
        return decimal;
    }
}
