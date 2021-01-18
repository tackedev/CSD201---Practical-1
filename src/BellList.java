import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author tackedev
 * @since Jan 18, 2021 8:44:24 AM
 */
public class BellList extends LinkedList<Bell> {
    
    public void addBell() {
        Bell bell = new Bell(KeyboardIO.getNoneEmptyString("Enter new bell Id: ", "Id cannot be empty!"));
        if (this.contains(bell)) {
            System.out.println("Id: " + bell.getId() + " is existed!");
        } else {
            bell.setManufacturer(KeyboardIO.getNoneEmptyString("Enter bell manufacturer: ", "Manufacturer cannot be empty!"));
            bell.setFrequency(KeyboardIO.getDouble("Enter bell frequency: ", "Frequency must be a number!"));
            bell.setWeight(KeyboardIO.getDouble("Enter bell weight: ", "Weight must be a number!"));
            if (this.add(bell)) {
                System.out.println("Add new bell successfully!");
            } else {
                System.out.println("Add fail!");
            }
        }
    }
    
    public void updateBell() {
        Bell bell = new Bell(KeyboardIO.getNoneEmptyString("Enter new bell Id: ", "Id cannot be empty!"));
        if (this.contains(bell)) {
            bell.setFrequency(KeyboardIO.getDouble("Enter new frequency: ", "Frequency must be a number!"));
            bell.setWeight(KeyboardIO.getDouble("Enter new weight: ", "Weight must be a number!"));
            System.out.println("Update successfully!");
        } else {
            System.out.println("Id: " + bell.getId() + " is not existed!");
        }
    }
    
    public void showAll() {
        if (this.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            Iterator it = this.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
    
    public void search() {
        double weight = KeyboardIO.getDouble("Enter low bound weight: ", "Weight must be a number!");
        boolean found = false;
        
        for (Bell bell: this) {
            if (bell.getWeight() >= weight) {
                System.out.println(bell);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("The is no bell has weight greater or equal " + weight);
        }
    }
}
