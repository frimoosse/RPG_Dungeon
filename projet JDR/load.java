import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.File;

public class load {
    public ArrayList<items> loadItems(String s){
        System.out.println("Loading items from file: " + s);
        ArrayList<items> c = new ArrayList<items>();
        try {
            ObjectInputStream loader = new ObjectInputStream(new FileInputStream(s));
            items line = (items) loader.readObject();
            while (line != null) {
                c.add(line);
                line = (items) loader.readObject();
            }
            loader.close();
        } catch (IOException e) {
            System.out.println("IOException occurred:");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred:");
            e.printStackTrace();
        }
        return c;
    }
    public void save(ArrayList<items> items, String s){
        File file = new File(s);    // Supprimer la save précédente
        file.delete();
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(s, true))) {
            writer.writeObject(items);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}