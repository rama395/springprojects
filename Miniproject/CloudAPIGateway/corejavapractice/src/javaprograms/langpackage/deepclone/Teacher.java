package javaprograms.langpackage.deepclone;

public class Teacher implements Cloneable {
    String name;
    HomeTown hmt;

    Teacher(String name, HomeTown hmt) {
        this.name = name;
        this.hmt = hmt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //TODO
        HomeTown homeTown = new HomeTown(this.hmt.city);
        return new Teacher(this.name, homeTown);
    }
}

