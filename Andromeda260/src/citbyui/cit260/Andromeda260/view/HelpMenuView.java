package citbyui.cit260.Andromeda260.view;

import java.util.Scanner;

/**
 *
 * @author reyob
 */
public class HelpMenuView extends View{

     public HelpMenuView(){
         this.menu = "\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nO - Objective"
            + "\nM - Movement help"
            + "\nQ - Quit";
     }
     
    @Override
     public void doAction(char selection) {
        
        switch (selection) {
             case 'A':
                 aboutGame();
                 break;
             case 'H':
                 howToPlay();
                 break;
             case 'O':
                 objectives();
                 break;
             case 'M':
                 movementHelp();
                 break;
             case 'Q':
                 break;
             default:
                 System.out.println("Invalid option");
                 break;
         }
    }
    
    private void aboutGame() {
        System.out.println("What is this game about");
    }

    private void howToPlay() {
        System.out.println("Teach them how to play");
    }

    private void objectives() {
        System.out.println("What are the objectives");
    }

    private void movementHelp() {
        System.out.println("Movement is expensive, be very careful");
    }
}
