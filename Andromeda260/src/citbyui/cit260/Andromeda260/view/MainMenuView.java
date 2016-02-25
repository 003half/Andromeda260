
package citbyui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class MainMenuView {
    
    private final String menu = "\n"
            + "\nN - Start New Game"
            + "\nL - Load Saved Game"
            + "\nS - Save Current Game"
            + "\nH - Help Menu"
            + "\nQ - Quit";

    void displayMenu() {
        System.out.println("This Function does nothing!");        
    }

    public void displayMainMenuView() {
        
       char selection = ' ';
       
       do {
           System.out.println(menu);
           
           String input = getInput();
           selection = input.charAt(0);
           
           doAction(selection);
       } while (selection != 'Q');
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while (!isValid){
            System.out.println("Please choose a course of action");
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input - please enter a valid character");
            }   else {
                 isValid = true;
                }
        }
        return input.toUpperCase();
    }

    private void doAction(char selection) {
        
        switch (selection){
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadSavedGame();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(Andromeda260.getPlayer());
        this.storyOfTheGame();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void loadSavedGame() {
        System.out.println("CALLED LOAD SAVED GAME - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void storyOfTheGame() {
        System.out.println("\n Put some sort of story here about needing to leave earth");
    }
    
}
