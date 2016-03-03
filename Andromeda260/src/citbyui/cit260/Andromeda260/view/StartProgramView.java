
package citbyui.cit260.Andromeda260.view;

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
        System.out.println("\n\n*****************************************");
        
        System.out.println("*                                       *"
                       + "\n*  This is the game of Andromeda        *"
                       + "\n*  In this game you will travel the     *"
                       + "\n*  stars as captain of the starship     *"
                       + "\n*  Butterfinger.                        *");
        
        System.out.println("*                                       *"
                        + "\n*  You and your crew will travel to     *"
                        + "\n*  different planets and battle aliens  *"
                        + "\n*  as you try to find a new home for    *"
                        + "\n*  humans.                              *");
        
        System.out.println("*                                       *"
                        + "\n*  Good luck and may the odds be ever   *"
                        + "\n*  in your favor.                       *");
        
        System.out.println("*                                       *"
                + "\n*****************************************");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid){ // while a valid name hasnot been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the lanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two character in length)
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        return playersName; // return the name
    }

    private void displayWelcomeMessage(String playerName) {
        System.out.println("\n\n====================================");
        System.out.println("\nWelcome to the game " + playerName);
        System.out.println("\nWe hope you have a lot of fun!");
        System.out.println("\n====================================");
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.display();
    }
}
