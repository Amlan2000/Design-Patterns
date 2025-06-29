package Composite;

public class File implements FileSystemComponent{

    private String fileName;

    public File (String name) {
        this.fileName = name;
    }

    @Override
    public void showDetails() {
        System.out.println("FileName is: "+ fileName);
    }
}
