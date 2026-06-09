package javaprograms.langpackage.deepclone;

public class HomeTown implements Cloneable {
    String city;

    HomeTown(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

