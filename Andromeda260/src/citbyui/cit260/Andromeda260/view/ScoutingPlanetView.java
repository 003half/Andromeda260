/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.MapControl;
import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class ScoutingPlanetView {
    
    public ScoutingPlanetView(){
    }

    void meetTheLocals() {
        //At some point we need to insert a way to check if the player has
        //been to this planet before.
        
        //For now, we will asume they have nevver been to this planet.
        System.out.println("\nAs you land your shuttle on the surface,"
                + "\nthe local vilagers are waiting to great you."
                + "\nFor now, they don't seem hostile, but are looking"
                + "\nfor your help."
                + "\nAn old man walks up to you and indicates for you"
                + "\nto follow him."
                + "\n"
                + "\nHe leads you  to a strange column, and indicates that you"
                + "\ncan have the contents if you can open it."
                + "\nAfter many hours of study, you realize that if you"
                + "\ncan guess the volume of the column, it will open"
                + "\nand reveal the prize inside.");
        double height = random() * 100;
        double radius = random() * 10;
        height = floor(height);
        radius = floor(radius);
        double diameter = radius * 2;
        double totalVolume = MapControl.cylinderVolumeCalculator(height, radius);
        System.out.println("\nYou measure and find the column is " + height +" units tall.");
        System.out.println("\nThe column is " + diameter + " units wide");
        
        System.out.println("\nGuess the volume of the column in cubic units");
        boolean valid = false;
        while (!valid){
        double guestimate = this.getInput();
        System.out.println("\nYour guess is " + guestimate);
            if ((guestimate == totalVolume) || 
                (((guestimate + 50) > totalVolume) && guestimate < totalVolume) ||
                (((guestimate - 50) < totalVolume) && guestimate > totalVolume) ){
                break;
            }
            System.out.println("\nTry again");
        }
        System.out.println("\nHaving guessed close enough, the column opens for you");
    }

    private double getInput() {
        
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
        double guestimate = Double.parseDouble(selection);
        return guestimate;
    }
    
    
    
}
