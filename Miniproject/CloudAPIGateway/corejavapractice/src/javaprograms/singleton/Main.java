package javaprograms.singleton;

public class Main
{
    public static void main(String[] args) {
//        SingleTon singleTon1= SingleTon.getInstanceEager();
//        SingleTon singleTon2= SingleTon.getInstanceEager();
        SingleTon singleTon3= SingleTon.getInstanceLazy();
        SingleTon singleTon4=SingleTon.getInstanceLazy();
        SingleTonSynchronized singleTonSynchronized1=SingleTonSynchronized.getInstance();
        SingleTonSynchronized singleTonSynchronized2=SingleTonSynchronized.getInstance();
        DoubleCheckedLocking doubleCheckedLocking1=DoubleCheckedLocking.getInstanceLock();
        DoubleCheckedLocking doubleCheckedLocking2=DoubleCheckedLocking.getInstanceLock();
        singleTon3.display("Application Started");
//        System.out.println(singleTon1==singleTon2);
        System.out.println(singleTon3==singleTon4);
        System.out.println(singleTonSynchronized1==singleTonSynchronized2);
        System.out.println(doubleCheckedLocking1==doubleCheckedLocking2);
    }
}
