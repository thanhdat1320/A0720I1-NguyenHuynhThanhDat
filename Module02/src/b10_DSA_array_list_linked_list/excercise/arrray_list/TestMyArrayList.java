package b10_DSA_array_list_linked_list.excercise.arrray_list;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student_1 = new Student(1, "Dat");
        Student student_2 = new Student(2, "Linh");
        Student student_3 = new Student(3, "Hung");
        Student student_4 = new Student(4, "Ngoc");
        Student student_5 = new Student(5, "Chau");
        Student student_6 = new Student(6, "Thang");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newStudentMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(student_2);
        studentMyArrayList.add(student_3);
        studentMyArrayList.add(student_4);
        studentMyArrayList.add(student_5);

//        for (int i = 0; i < studentMyArrayList.size() ; i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getName());
//            System.out.println(student.getId());
//        }

//        System.out.println(studentMyArrayList.indexOf(student_3));

//        System.out.println(studentMyArrayList.contains(student_6));

        newStudentMyArrayList = studentMyArrayList.clone();
        newStudentMyArrayList.remove(1);
        for (int i = 0; i < newStudentMyArrayList.size() ; i++) {
            System.out.println(newStudentMyArrayList.get(i).getName());
        }
    }
}
