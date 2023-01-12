package DesignPattern;
/*
  @created 21/11/22
  @author  manish.mandora
*/

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("this is private area...");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getInstance_() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    //Double check
    public static Singleton getInstance__() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        Singleton singleton=new Singleton();
        Thread thread=new Thread();
        thread.run();
        System.out.println(Singleton.getInstance_());
        System.out.println(Singleton.getInstance__());
    }
}
