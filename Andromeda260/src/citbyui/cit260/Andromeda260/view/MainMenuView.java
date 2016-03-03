
package citbyui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.control.GameControl;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class MainMenuView extends View {
    
      public MainMenuView() {
        this.menu = "\n"
                + "\nN - Start New Game"
                + "\nL - Load Saved Game"
                + "\nS - Save Current Game"
                + "\nH - Help Menu"
                + "\nQ - Quit";
    }
    
    @Override
    public void doAction(char selection) {
        
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
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("CALLED LOAD SAVED GAME - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void storyOfTheGame() {
        System.out.println("\n Put some sort of story here about needing to leave earth");
    }
    
}
