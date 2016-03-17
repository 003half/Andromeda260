/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package byui.cit260.Andromeda260.control;

import byui.cit260.Andromeda260.model.Planet;

/**
 *
 * @author rubengonzalezflores
 */
public class ShipControl {
    
    public static double fuelAvailable(){
        double flA = andromeda260.Andromeda260.getGame().getShip().getFuel();
        return flA;
    }
    
    public static void useFuel (double fuelUsed){
        double fuelAvailable = andromeda260.Andromeda260.getGame().getShip().getFuel();
        fuelAvailable -= fuelUsed;
        andromeda260.Andromeda260.getGame().getShip().setFuel(fuelAvailable);
    }
    
    public static Planet getCurrentPlanet(){
        Planet playerLocation = andromeda260.Andromeda260.player.getLocation();
        int row = playerLocation.getRow();
        int col = playerLocation.getColumn();
        Planet currentLocation = andromeda260.Andromeda260.getGame().getMap().getPlanet()[row][col];
        return currentLocation;
    }
    
}
