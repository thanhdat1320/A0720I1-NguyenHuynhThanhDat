package b10_DSA_array_list_linked_list.excercise.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int id;

            public Student() {
            }

            public Student(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student_1 = new Student("Nam", 1);
        Student student_2 = new Student("Dat", 2);
        Student student_3 = new Student("Don", 3);
        Student student_4 = new Student("Duy", 4);
        Student student_5 = new Student("Sang", 5);
        Student student_6 = new Student("Dung", 6);

        myLinkedList.addFirst(student_1);
        myLinkedList.addFirst(student_2);
        myLinkedList.addFirst(student_3);
        myLinkedList.addFirst(student_4);
        myLinkedList.addFirst(student_5);
//        myLinkedList.remove(2);
//        myLinkedList.remove(student_1);
//        myLinkedList.remove(student_2);

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();


        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
//            System.out.println(student.getId());
        }
//        System.out.println("===============");
//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
////            System.out.println(student.getId());
//        }

//        System.out.println(myLinkedList.constains(student_2));
//        System.out.println(myLinkedList.indexOf(student_3));

//        System.out.println(myLinkedList.getFirst().getName());
        System.out.println(myLinkedList.getLast().getName());
        myLinkedList.clear();
        System.out.println(myLinkedList.getFirst());
    }
}
