package javaprograms.builderpattern;

import java.lang.module.ModuleDescriptor;

public class Student {
    //required fields
    private final int id;
    private final String name;
    //optional fields
    private final int age;
    private final String department;
    private final String email;

    //private constructor
    private Student(Builder builder)
    {
        this.id=builder.id;
        this.name= builder.name;
        this.age= builder.age;
        this.department= builder.department;
        this.email= builder.email;
    }
    //static builder class
    public static class Builder{
        //required fields
        private final int id;
        private final String name;
        //optional
        private int age;
        private String department;
        private String email;

        public Builder(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
        public Builder age(int age)
        {
            this.age=age;
            return this;
        }
        public Builder department(String department)
        {
            this.department=department;
            return this;
        }
        public Builder email(String email)
        {
            this.email=email;
            return this;
        }
        public Student build()
        {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student=new Student.Builder(101,"rama")
                .age(30)
                .department("ece")
                .email("XYZ")
                .build();
        System.out.println(student);
    }
}
