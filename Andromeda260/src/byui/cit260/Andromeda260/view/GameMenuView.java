package byui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.control.ShipControl;
import byui.cit260.Andromeda260.model.MaterialResources;
import byui.cit260.Andromeda260.model.Planet;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class GameMenuView extends View{

    public GameMenuView(){
        this.menu = "\n"
            + "\nA - Attack the natives"
            + "\nM - Display the Map"
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
            case 'M':
                displayMap(Andromeda260.getGame().getMap().getPlanet());
                break;
            case 'L':
                leaveLocation();
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

    private void displayMap(Planet[][] planet) {
        System.out.println("\nMap of known planets with resources available");
        System.out.println("\nThe narrow band of space available is due to your ships"
                + "limited range.");
        System.out.println(Andromeda260.getGame().getMap().getMapString());
    }

    private void scoutCurrentLocation() {
        Planet currentLocation = ShipControl.getCurrentPlanet();
        if (currentLocation.getVisited() == true){
            System.out.println("\nYou have already been here");
        } else {
            ScoutingPlanetView scoutingPlanet = new ScoutingPlanetView();
            scoutingPlanet.display();}
    }
    
    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void upgradeArmorOrWeapon() {
        UpgradeResources upgradeResources = new UpgradeResources();
        upgradeResources.display();
        
    }

    private void displayInventory(){
        MaterialResources[] materials = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Resources");
        
        for (MaterialResources materialResources : materials){
            System.out.println(materialResources.getDescription() + ",\t"+
                               materialResources.getQuantity() + "\t   ");
        }
        int weight = GameControl.getInventoryWeight();
        System.out.println("\nand they weigh " + weight + " tons.");
        double fuelOnHand = ShipControl.fuelAvailable() * 100;
        System.out.println("\nYou have " + fuelOnHand + "% of a fully charged battery available for your warp drive");
    }

    private void leaveLocation() {
        MovementView movementView = new MovementView();
        movementView.display();
    }
}
