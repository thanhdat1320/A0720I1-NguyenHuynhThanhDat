package b2_loop.Bai_Tap;

public class Drawing {
    public static void rectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle_1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle_2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle_3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j < 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rectangle();
        triangle_1();
        triangle_2();
        triangle_3();
    }
}
