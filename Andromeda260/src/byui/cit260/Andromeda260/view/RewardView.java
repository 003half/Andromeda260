/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.GameControl;
import byui.cit260.Andromeda260.control.ShipControl;

/**
 *
 * @author reyob
 */
public class RewardView extends View {

    public RewardView() {
        this.menu = "\nAs the column opens, you see the treasure inside."
                + "\nYou take it back to your ship, and have your engineers"
                + "\nexamine it to find a use for it."
                + "\n---------------------------------------------"
                + "\nAfter much time they bring it back to you and tell you that"
                + "\nthe item is useless as it is. Your engineer suggest that you"
                + "\nsell it to the scrap yard for credits."
                + "\nYour chief of security suggests that one of the contacts he"
                + "\nhas made recently may be able to get you something of value"
                + "\nfor it instead."
                + "\nWhat do you decide?"
                + "\nC - Sell it for credits"
                + "\nT - Trade it for something else";
    }
    
    @Override
    public void doAction(char selection) {
        
        switch (selection) {
            case 'C':
                getCredits();
                break;
            case 'T':
                getResource();
                break;
            default:
                this.console.println("Invalid option");
                break;
        }
    }
    
    @Override
    public void display() {
        char selection = ' ';
        boolean valid = false;
        while (!valid) {
            this.console.println(this.menu);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            if (selection == 'T'){valid = true;}
            if (selection == 'C'){valid = true;}
        } 
    }

    private void getCredits() {
        int before = GameControl.getCoinsValue();
        GameControl.addRandomCredits();
        int after = GameControl.getCoinsValue();
        int earned = after - before;
        this.console.println("\nYou earned " + earned + " credits from the sale."
                + "\nYou now have " + after + " credits.");
    }

    private void getResource() {
        
    }
    
    
}
