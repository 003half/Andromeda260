package citbyui.cit260.Andromeda260.view;

import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class GameMenuView {
    
    private final String menu = "\n"
            + "\nA - Attack the natives"
            + "\nL - Leave location"
            + "\nS - Scout the current location"
            + "\nI - Increase weapon Damage"
            + "\nU - Upgrade armor"
            + "\nH - Help Menu"
            + "\nQ - Quit";
    
    public GameMenuView(){
    
    }
    
     void displayGameMenu() {
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        } while (selection != 'Q');
    }

    private void doAction(char selection) {
        
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
    
     private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
 
        while (!isValid) {
            System.out.println("Please select an option: ");
            input = keyboard.nextLine();
            input = input.trim();
 
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input - please enter a valid character");
            } else {
                isValid = true;
            }
        }
        return input.toUpperCase();
    }

    private void attackNatives() {
        System.out.println("called attack Natives");
    }

    private void leaveLocation() {
        System.out.println("called leaveLocation");
    }

    private void scoutCurrentLocation() {
        ScoutingPlanetView scoutingPlanet = new ScoutingPlanetView();
        scoutingPlanet.meetTheLocals();
        
    }
    
    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void upgradeArmor() {
        System.out.println("called upgradeArmor");
    }

    private void improveWeapon() {
        System.out.println("called improveWeapon");
    }
     
}
