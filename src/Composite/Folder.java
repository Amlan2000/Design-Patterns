package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String folderName;
    private List<FileSystemComponent> components = new ArrayList<>();


    public Folder(String name)
    {
        this.folderName=name;
    }

    @Override
    public void showDetails() {
        System.out.println("FolderName is: "+ folderName);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

    public void addComponents(FileSystemComponent component)
    {
        components.add(component);
    }
}
