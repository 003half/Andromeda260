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
            + "\nG - Save Game progress"
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
            case 'G':
                saveCurrentGame();
            case 'H':
                helpMenu();
                break;
            case 'Q':
                break;
            default:
                this.console.println("Invalid option");
                break;
        }
    }

    private void attackNatives() {
        AttackNativesView attackNatives = new AttackNativesView();
        attackNatives.display();
        
    }

    private void displayMap(Planet[][] planet) {
        this.console.println("\nMap of known planets with resources available");
        this.console.println("\nThe narrow band of space available is due to your ships"
                + " limited range.");
        this.console.println(Andromeda260.getGame().getMap().getMapString());
    }

    private void scoutCurrentLocation() {
        Planet currentLocation = ShipControl.getCurrentPlanet();
        if (currentLocation.getVisited() == true){
            this.console.println("\nYou have already been here");
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
        
        this.console.println("\nList of Resources");
        
        for (MaterialResources materialResources : materials){
            this.console.println(materialResources.getDescription() + ",\t"+
                               materialResources.getQuantity() + "\t   ");
        }
        int weight = GameControl.getInventoryWeight();
        this.console.println("\nand they weigh " + weight + " tons.");
        double fuelOnHand = ShipControl.fuelAvailable() * 100;
        this.console.println("\nYou have " + fuelOnHand + "% of a fully charged battery available for your warp drive");
    }

    private void leaveLocation() {
        MovementView movementView = new MovementView();
        movementView.display();
    }

    private void saveCurrentGame() {
         //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where you wish"
                + " to save your progress.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(Andromeda260.getGame(), filePath);
            this.console.println("\nSave successful");
        } catch (Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
}
