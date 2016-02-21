/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda260.view;

import java.util.Scanner;

/**
 *
 * @author reyob
 */
public class HelpMenuView {
     private final String menu = "\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nO - Objective"
            + "\nM - Movement help"
            + "\nQ - Quit";
     
     public HelpMenuView(){
     
     }

    void displayMenu() {
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
