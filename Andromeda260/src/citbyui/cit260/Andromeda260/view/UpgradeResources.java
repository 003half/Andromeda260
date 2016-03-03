package citbyui.cit260.Andromeda260.view;

/**
 *
 * @author rubengonzalezflores & Dean Boyer
 */
public class UpgradeResources extends View{
    
    public UpgradeResources(){
        this.menu = "\nDo you have enough resources to upgrade"
                + "\nyour weapons or armor?"
                + "\n"
                + "\nChoose which you would like to upgrade"
                + "\nA - to upgrade armor"
                + "\nW - to upgrade weapons"
                + "\nH - Help menu"
                + "\nQ - if you don't think you can upgrade either";
        }
    
    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'W':
                upgradeWeapon();
                break;
            case 'A':
                upgradeArmor();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
        
    private void upgradeWeapon(){
        //To Be Used! Figured we could use this Class for both Armor and other resources later on
        System.out.println("\nFor now, you have earned yourself one free upgrade.");
        //This function to be repaired later
    }

    private void upgradeArmor() {
       //To Be Used!! Calcualte how to upgrade armor. Use this.getNumberinput().
        System.out.println("\nOkay, you can have another free upgrade");
        //This function to be completed later
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    }