package javaprograms.langpackage;

import java.util.Objects;

class Student {
    String name;
    int rollNumb;

    public Student(String name, int rollNumb) {
        this.name = name;
        this.rollNumb = rollNumb;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return rollNumb == student.rollNumb && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumb);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumb=" + rollNumb +
                '}';
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Student s1 = new Student("Geetha", 101);
        Student s2 = new Student("Geetha", 101);
        Student s3 = new Student("Preeti", 102);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
