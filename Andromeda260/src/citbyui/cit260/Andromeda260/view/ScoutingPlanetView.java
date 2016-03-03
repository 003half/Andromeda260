package citbyui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.MapControl;
import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class ScoutingPlanetView extends View{
    
    public ScoutingPlanetView(){
        this.menu = "\nAs you land your shuttle on the surface,"
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
                + "\nand reveal the prize inside.";
    }

    @Override
    public void display() {
        //At some point we need to insert a way to check if the player has
        //been to this planet before.
        //For now, we will asume they have nevver been to this planet.
        System.out.println(this.menu);
        double height = random() * 100;
        double radius = random() * 10 + 1;
        height = floor(height);
        radius = floor(radius);
        double diameter = radius * 2;
        double totalVolume = MapControl.cylinderVolumeCalculator(height, radius);
        System.out.println("\nYou measure and find the column is " + height +" units tall.");
        System.out.println("\nThe column is " + diameter + " units wide");
        
        System.out.println("\nGuess the volume of the column in cubic units");
        boolean valid = false;
        while (!valid){
        double guestimate = this.getNumberInput();
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
    
}