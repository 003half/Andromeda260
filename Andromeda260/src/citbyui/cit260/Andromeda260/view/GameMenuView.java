package citbyui.cit260.Andromeda260.view;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        this.menu = "\n"
            + "\nA - Attack the natives"
            + "\nL - Leave location"
            + "\nS - Scout the current location"
            + "\nI - Increase weapon Damage"
            + "\nU - Upgrade armor"
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
                leaveLocation();
                break;
            case 'S':
                scoutCurrentLocation();
                break;
            case 'I':
                improveWeapon();
                break;
            case 'U':
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

    private void attackNatives() {
        AttackNativesView attackNatives = new AttackNativesView();
        attackNatives.display();
        
    }

    private void leaveLocation() {
        System.out.println("called leaveLocation");
    }

    private void scoutCurrentLocation() {
        ScoutingPlanetView scoutingPlanet = new ScoutingPlanetView();
        scoutingPlanet.display();
        
    }
    
    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void upgradeArmor() {
        UpgradeResources upgradeResources = new UpgradeResources();
        upgradeResources.display();
        
    }

    private void improveWeapon() {
        UpgradeResources upgradeResources = new UpgradeResources();
        upgradeResources.display();
    }
     
}
