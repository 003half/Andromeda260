
package byui.cit260.Andromeda260.view;

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
            case 'H':
                helpMenu();
                break;
            case 'Q':
                break;
            default:
                this.console.println("Invalid Option");
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
        //prompt for and get the name of the file where saved
        this.console.println("\n\nEnter the file path for the saved game.");
        
        String filePath = this.getFileName();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
            //display the game menu
        } catch (Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    /*
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
    */

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void storyOfTheGame() {
        this.console.println("\n Put some sort of story here about needing to leave earth");
    }
    
}
