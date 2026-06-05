package javaprograms.langpackage;

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        HomeTown hmt = new HomeTown("Anantapur");
        Teacher t1 = new Teacher("Amar", hmt);
        Teacher t2 = (Teacher) t1.clone();
        t2.hmt.city = "Tadipatri";
        System.out.println("Original city:" + t1.hmt.city);
        System.out.println("Cloned city:" + t2.hmt.city);
    }
}

class HomeTown implements Cloneable{
    String city;

    HomeTown(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Teacher implements Cloneable {
    String name;
    HomeTown hmt;

    Teacher(String name, HomeTown hmt) {
        this.name = name;
        this.hmt = hmt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher clonedTeacher = (Teacher) super.clone();
        clonedTeacher.hmt = (HomeTown) this.hmt.clone();
        return clonedTeacher;
    }
}
