package javaprograms.langpackage.comparatorclass;

import java.util.TreeSet;

public class Company
{
    public static void main(String[] args) {
        Employee e1=new Employee(200,20000.00,"Rama");
        Employee e2=new Employee(100,30000.00,"Preeti");
        Employee e3=new Employee(500,10000.00,"Joe");
        Employee e4=new Employee(500,30000.00,"Rose");
        Employee e5=new Employee(700,50000.00,"Jasper");
        TreeSet t1=new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
        TreeSet t2=new TreeSet(new MyComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);
    }
}
