package javaprograms.langpackage.shallowclone;

public class ShallowClone
{
        public static void main(String[] args) throws CloneNotSupportedException {
            Address add = new Address("Bengaluru");
            Employee emp1 = new Employee("Preeti", add);
            Employee emp2 = (Employee) emp1.clone();
            emp2.addrs.city = "NewYork";
            System.out.println("Original city:" + emp1.addrs.city);
            System.out.println("Cloned city:" + emp2.addrs.city);
        }
}

