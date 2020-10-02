package B4_Class_And_Object_Java.Bai_Tap.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (- this.getB() + Math.pow(this.getDiscriminant(), 0.5) / 2 * this.getA());
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (- this.getB() - Math.pow(this.getDiscriminant(), 0.5) / 2 * this.getA());
        }
    }
}
