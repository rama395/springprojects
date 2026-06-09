package javaprograms.langpackage.deepclone;


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

