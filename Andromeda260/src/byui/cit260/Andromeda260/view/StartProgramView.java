
package byui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.model.Player;
import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class StartProgramView extends View{
    
    public StartProgramView(){
    }
    public void startProgram(){

        //Display the banner screen
        this.display();
        
        // prompt the player to enter their name, retrieve the name of the player
        String playerName = this.getInput();
        
        //Create and save the player object
        Player player = GameControl.createPlayer(playerName);
        
        //set the player
        Andromeda260.setPlayer(player);
        
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player.getName());

        //DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

        //END


    }

    @Override
    public void display() {
        this.console.println("\n\n*****************************************");
        
        this.console.println("*                                       *"
                       + "\n*  This is the game of Andromeda        *"
                       + "\n*  In this game you will travel the     *"
                       + "\n*  stars as captain of the starship     *"
                       + "\n*  Butterfinger.                        *");
        
        this.console.println("*                                       *"
                        + "\n*  You and your crew will travel to     *"
                        + "\n*  different planets and battle aliens  *"
                        + "\n*  as you try to find a new home for    *"
                        + "\n*  humans.                              *");
        
        this.console.println("*                                       *"
                        + "\n*  Good luck and may the odds be ever   *"
                        + "\n*  in your favor.                       *");
        
        this.console.println("*                                       *"
                + "\n*****************************************");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        
        try {
            while(!valid){ // while a valid name hasnot been retrieved

                // prompt for the player's name
                this.console.println("Enter the player's name below:");

                // get the name from the keyboard and trim off the lanks
                playersName = this.keyboard.readLine();
                playersName = playersName.trim();

                // if the name is invalid (less than two character in length)
                if (playersName.length() < 2){
                    this.console.println("Invalid name - the name must not be blank");
                    continue; // and repeat again
                }
                break; // out of the (exit) the repetition
            }
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), ("Error reading input: " + e.getMessage()));
        }
        
        return playersName; // return the name
    }

    private void displayWelcomeMessage(String playerName) {
        this.console.println("\n\n====================================");
        this.console.println("\nWelcome to the game " + playerName);
        this.console.println("\nWe hope you have a lot of fun!");
        this.console.println("\n====================================");
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.display();
    }
}
