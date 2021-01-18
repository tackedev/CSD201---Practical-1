import java.util.ArrayList;

/**
 *
 * @author tackedev
 */
public class Menu {
    private final String title;
    private final ArrayList<String> options = new ArrayList<>();

    public Menu(String title) {
        this.title = title;
    }
    
    public void addOption(String option) {
        options.add(option);
    }
    
    public void print() {
        System.out.println("--------- " + title + " ---------");
        options.forEach(option -> {
            System.out.println(option);
        });
    }
    
    public int getChoice() {
        int size = options.size();
        return KeyboardIO.getInteger("Enter your choice [1-" + size + "]: ", "Input is not accepted", 1, size);
    }
    
}