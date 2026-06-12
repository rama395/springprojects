package javaprograms.langpackage.comparatorclass;

import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object obj1,Object obj2)
    {
        Employee e1=(Employee) obj1;
        Employee e2=(Employee) obj2;
        return e2.compareTo(e1);
    }
}
