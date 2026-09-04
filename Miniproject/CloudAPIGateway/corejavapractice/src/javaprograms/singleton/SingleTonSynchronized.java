package javaprograms.singleton;

public class SingleTonSynchronized
{
    private static SingleTonSynchronized instance;
    private SingleTonSynchronized()
    {

    }
    public static synchronized SingleTonSynchronized getInstance()
    {
        if (instance==null)
        {
            instance= new SingleTonSynchronized();
        }
        return instance;
    }
}
