package citbyui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.model.MaterialResources;
import byui.cit260.Andromeda260.model.Planet;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class GameMenuView extends View{
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLUMNS = 5;
    public GameMenuView(){
        this.menu = "\n"
            + "\nA - Attack the natives"
            + "\nL - Leave Location"
            + "\nS - Scout the Current Location"
            + "\nI - Inventory"
            + "\nU - Upgrade Armor or Weapon"
            + "\nH - Help Menu"
            + "\nQ - Quit";
    }
    
    @Override
    public void doAction(char selection) {
        
        switch (selection) {
            case 'A':
                attackNatives();
                break;
            case 'L':
                displayMap();
                break;
            case 'S':
                scoutCurrentLocation();
                break;
            case 'I':
                displayInventory();
                break;
            case 'U':
                upgradeArmorOrWeapon();
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

    private void attackNatives() {
        AttackNativesView attackNatives = new AttackNativesView();
        attackNatives.display();
        
    }

    private void displayMap() {
        
        System.out.println("called displayMap");
        System.out.println("Map!");
        System.out.println("0 | 1 | 2 | 3 | 4 ");
        for (int i = 0; i < NUM_ROWS; i++){
            System.out.println("\n\t");
        }
    }

    private void scoutCurrentLocation() {
        ScoutingPlanetView scoutingPlanet = new ScoutingPlanetView();
        scoutingPlanet.display();
        
    }
    
    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void upgradeArmorOrWeapon() {
        UpgradeResources upgradeResources = new UpgradeResources();
        upgradeResources.display();
        
    }

    private void displayInventory() {
        
    }
     
    private void viewInventory(){
        MaterialResources[] materialResources = GameControl.getSortedInventoryList();
        
        System.out.println("List of Resources");
        
        for (MaterialResources materialResources : resources){
            System.out.println(MaterialResources.getDescription() + "\t "+
                    MaterialResources.getQuantity() + "\t   ");
            
        }
        
    }
}
