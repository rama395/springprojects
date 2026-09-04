package javaprograms.singleton;


class SingleTon {
    //eager initialization-object is created when class is loaded
    //private static final SingleTon instance = new SingleTon();
    //lazy initialization-first call to getInstance() creates object
    private static SingleTon instance=new SingleTon();
    private SingleTon() {
    };

    public static SingleTon getInstanceEager() {
        return instance;
    }
    public static SingleTon getInstanceLazy()
    {
        if (instance==null)
        {
            instance=new SingleTon();
        }
        return instance;
    }

    public void display(String message) {
        System.out.println("DISPLAY: " + message);
    }
}

