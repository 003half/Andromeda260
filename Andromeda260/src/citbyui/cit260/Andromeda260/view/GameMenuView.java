package citbyui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.control.MapControl;
import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Map;
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
            case 'L':
                //need function for movement here
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
        System.out.println(Andromeda260.getGame().getMap().getMapString());
    }

    private void scoutCurrentLocation() {
        if (Andromeda260.player.getLocation().getVisited() == true){
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
    }
}
