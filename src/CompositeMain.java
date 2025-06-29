import Composite.File;
import Composite.FileSystemComponent;
import Composite.Folder;

public class CompositeMain {

    public static void main(String [] args)
    {
        System.out.println("Hello and welcome to Composite Main!\n");

        FileSystemComponent file1 = new File("abc.txt");
        FileSystemComponent file2 = new File("def.pdf");
        FileSystemComponent file3 = new File("pqr.jpeg");

        Folder folder1 = new Folder("MyFolder");
        folder1.addComponents(file1);
        folder1.addComponents(file2);

        Folder folder2 = new Folder("Desktop");
        folder2.addComponents(file3);
        folder2.addComponents(folder1);

        folder2.showDetails();

    }
}
