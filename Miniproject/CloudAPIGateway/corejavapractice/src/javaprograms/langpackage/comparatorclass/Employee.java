package javaprograms.langpackage.comparatorclass;

public class Employee implements Comparable
{
    int eId;
    double eSal;
    String eName;
    Employee(int eId,double eSal,String eName)
    {
        this.eId=eId;
        this.eSal=eSal;
        this.eName=eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eSal=" + eSal +
                ", eName='" + eName + '\'' +
                '}';
    }

    public int compareTo(Object obj)
    {
        int eId1=this.eId;
        double eSal1=this.eSal;
        String eName1=this.eName;
        Employee e2=(Employee) obj;
        int eId2=e2.eId;
        double eSal2=e2.eSal;
        String eName2=e2.eName;
        if (eSal1<eSal2)
            return -1;
        else if (eSal1>eSal2) {
            return +1;
        }
        else
            return 0;
    }
}
