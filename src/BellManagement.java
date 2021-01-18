/**
 *
 * @author tackedev
 * @since Jan 18, 2021 9:04:51 AM
 */
public class BellManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu = new Menu("Bell Management");
        menu.addOption("1. Add new bell.");
        menu.addOption("2. Update.");
        menu.addOption("3. Show all.");
        menu.addOption("4. Search by weight.");
        menu.addOption("5. Quit.");
        
        BellList list = new BellList();
        
        int choice;
        do {
            menu.print();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addBell();
                    break;
                case 2: 
                    list.updateBell();
                    break;
                case 3:
                    list.showAll();
                    break;
                case 4:
                    list.search();
                    break;
            }
        } while (choice != 5); 
    }
}
