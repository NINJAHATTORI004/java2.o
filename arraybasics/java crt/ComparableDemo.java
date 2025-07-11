import java.util.TreeSet;

class Student implements Comparable<Student> {
    int marks;
    String name;
    int age;

    public Student(int marks, String name, int age) {
        this.marks = marks;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // Sort by marks (ascending)
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " (" + marks + ", " + age + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> it_b = new TreeSet<Student>();
        Student s1 = new Student(89, "John", 20);
        Student s2 = new Student(67, "Roger", 19);
        Student s3 = new Student(92, "Steven", 20);
        it_b.add(s1);
        it_b.add(s2);
        it_b.add(s3);

        System.out.println(it_b);
    }
}