/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.control.MapControl;
import byui.cit260.Andromeda260.control.ShipControl;
import byui.cit260.Andromeda260.model.Planet;

/**
 *
 * @author Dean Boyer & Rueben Gonzales
 */
public class MovementView extends View{
    
    public MovementView(){
        this.menu = "\n"
                + "";
    }
    
    @Override
    public void display(){
        //display instructions
        this.console.println(this.menu);
        //get position
        Planet currentLocation = andromeda260.Andromeda260.getPlayer().getLocation();
        int curow = currentLocation.getRow();
        int cucolumn = currentLocation.getColumn();
        int column = 0;
        int row = 0;
        double fuelN = 0;
        boolean valid = false;
        while (!valid) {
            try {
                try {
                    //display map
                    this.console.println(andromeda260.Andromeda260.getGame().getMap().getMapString());
                    //display position
                    this.console.println("You are currently at row " + (curow + 1) + " in column " + (cucolumn + 1) );
                    //get row destination
                    this.console.println("What row of planets would you like to venture towards? (1, 2, or 3)");
                    row = (int) (getNumberInput() - 1);
                    //get column destination
                    this.console.println("What column of planets in row " + (row + 1) + " would you like to visit?");
                    column = (int) (getNumberInput() - 1);
                    // calculate distance to new location
                    double distance = MapControl.distanceToPlanet(curow, cucolumn, row, column);
                    // checks to verify you have enough fuel
                    fuelN = MapControl.fuelNeeded(distance);
                    double fuelA = ShipControl.fuelAvailable();
                    if (fuelA >= fuelN){
                        this.console.println("You have enough fuel to get there");
                    }
                    else {ErrorView.display(this.getClass().getName(), ("You don't have enough fuel to get there."
                            + "\nTry again."));}
                } catch (NumberFormatException nfe) {
                    ErrorView.display(this.getClass().getName(), "Invalid option, Lets try that again.");
                }
                andromeda260.Andromeda260.getPlayer().getLocation().setColumn(column);
                andromeda260.Andromeda260.getPlayer().getLocation().setRow(row);
                Planet destination = ShipControl.getCurrentPlanet();
                valid = true;
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                ErrorView.display(this.getClass().getName(), "\nThe coordinates you wish to explore do not exist."
                        + "\nYour navigator looks at you in disbelief");
                andromeda260.Andromeda260.getPlayer().getLocation().setColumn(cucolumn);
                andromeda260.Andromeda260.getPlayer().getLocation().setRow(curow);
            }
        }
        ShipControl.useFuel(fuelN);
    }
    
}
