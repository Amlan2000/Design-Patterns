package Singleton;

public class Printer implements Cloneable{

    private static Printer printerInstance;

    private Printer(){
        if(printerInstance!=null)    // this if block is added to prevent reflection API to create another object
            throw new RuntimeException("Object has already been created");
    }

    public static Printer getPrinter(){  // We do not make this method synchronised as it will also block methods other than object creation. We only want to block the object creation

        System.out.println("Inside getPrinterMethod() \n");

        if(printerInstance==null) {         //if object is already created, no need to synchronise it and block the execution

            synchronized (Printer.class) {  // we use synchronized to prevent multithreading object creation
                if (printerInstance == null)
                    printerInstance = new Printer();
            }
        }
        return printerInstance;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();   // this will create another object
        return new CloneNotSupportedException("Cloning not supported for singleton");
    }
}

