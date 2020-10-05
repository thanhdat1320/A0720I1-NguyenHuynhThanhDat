package B5_AccessModifier_StaticMethod_StaticProperty.Thuc_Hanh;

public class AccessModifier {
    static class  A {
        private int data = 40;
        private void msg() {
            System.out.println("heloo");
        }
    }

    public static class Simple {
        public static void main(String[] args) {
            A obj = new A();
            System.out.println(obj.data);
            obj.msg();
        }
    }

}
