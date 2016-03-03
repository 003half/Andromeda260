package citbyui.cit260.Andromeda260.view;

import java.util.Scanner;

/**
 *
 * @author Dean Boyer & Rueben Gonzales
 */
public abstract class View implements ViewInterface {
    
    protected String menu ="\n Well that didn't work";
    
     public void display() {
        
       char selection = ' ';
       
       do {
           System.out.println(this.menu);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
       } while (selection != 'Q');
    }
     
    public String getInput() {
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
    
    public Double getNumberInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid parameter has not beein input, will loop
        while (!valid){
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {//blank value entered
                System.out.println("\n** Invalid selection ** Try again");
            }
            try {
                Double.parseDouble(selection);
                valid = true;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Input was not a number, please use numbers only");
            }
            
        }
        double numberInput = Double.parseDouble(selection);
        return numberInput;
    }

    public void doAction(char selection) {
        System.out.println("\n This message from the View layer");
    }
    
    
    
}
