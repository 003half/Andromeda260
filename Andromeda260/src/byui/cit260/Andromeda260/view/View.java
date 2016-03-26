package byui.cit260.Andromeda260.view;

import andromeda260.Andromeda260;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Dean Boyer & Rueben Gonzales
 */
public abstract class View implements ViewInterface {
    
    protected String menu ="\n Well that didn't work";
    
    protected final BufferedReader keyboard = Andromeda260.getInFile();
    protected final PrintWriter console = Andromeda260.getOutFile();
    
     public void display() {
        
       char selection = ' ';
       
       do {
           this.console.println(this.menu);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
       } while (selection != 'Q');
    }
     
    public String getInput() {
        String input = null;
        boolean isValid = false;
        
        try {
            while (!isValid){
                this.console.println("Please choose a course of action");
                input = this.keyboard.readLine();
                input = input.trim();

                if (input == null || input.length() == 0) {
                    ErrorView.display(this.getClass().getName(), "Invalid input - please enter a valid character");
                }   else {
                     isValid = true;
                    }
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return input.toUpperCase();
    }
    
    public Double getNumberInput() {
        boolean valid = false;
        String selection = null;
        double numberInput = 0;
        
        try {
            //while a valid parameter has not beein input, will loop
            while (!valid){

                //get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim();

                if (selection.length() < 1) {//blank value entered
                    this.console.println("\n** Invalid selection ** Try again");
                }
                try {
                    numberInput = Double.parseDouble(selection);
                    valid = true;
                }
                catch (NumberFormatException nfe) {
                    ErrorView.display(this.getClass().getName(), "Input was not a number, please use numbers only");
                }
            }
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), ("Error reading input: " + e.getMessage()));
        }
        return numberInput;
    }

    public void doAction(char selection) {
        this.console.println("\n This message from the View layer");
    }
    
    
    
}
