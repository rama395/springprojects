package javaprograms.langpackage.shallowclone;

public class Employee implements Cloneable
{
        String name;
        Address addrs;

        public Employee(String name,Address addrs) {
            this.name = name;
            this.addrs=addrs;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }
}

