public class Student {
    public String name;
    public int age;
    public double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.printf("Tên: %s, Tuổi: %d, Điểm: %f\n", name, age, grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nhi", 25, 9);
        Student student2 = new Student("Hạnh", 22, 8);

        student1.displayInfo();
        student2.displayInfo();
    }

}
