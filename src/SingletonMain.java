import Singleton.Printer;

import java.lang.reflect.InvocationTargetException;


public class SingletonMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {


        System.out.printf("Hello and welcome to Singleton Main!\n");

        Printer p1 = Printer.getPrinter();
        System.out.println(p1.hashCode());

        Printer p2 = Printer.getPrinter();
        System.out.println(p2.hashCode());

        //Reflection API , a way to access private constructor and break singleton pattern

//        Constructor<Printer> constructor = Printer.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Printer p3 = constructor.newInstance();
//        System.out.println(p3.hashCode());


        // If Singleton implements Cloneable, you can call .clone() and get a new instance.

        Printer p4 = Printer.getPrinter();
        System.out.println(p4.hashCode());
        Printer p5 = (Printer) p4.clone();
        System.out.println(p5.hashCode());



    }
}