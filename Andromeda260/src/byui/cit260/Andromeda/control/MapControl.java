/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda.control;

import byui.cit260.Andromeda.model.Ship;

/**
 *
 * @author rubengonzalezflores
 */
public class MapControl {
     public double distanceToPlanet(double pointA, double pointB)
        {
            double distance = 0;
            if (pointA > pointB)   {
                    distance = pointA - pointB;
            }
            if (pointA < pointB)    {
                    distance = pointB - pointA;
            }
                    return distance;
        }
     public double fuelNeeded(double pointA, double pointB, double armor, double iridium, double palladium, double platinum)     {
            double currentArmor = armor;
            double currentIridium = iridium;
            double currentPalladium = palladium;
            double currentPlatinum = platinum;
            double totalResources = currentIridium + currentPalladium + currentPlatinum;
            double distanceToTravel = this.distanceToPlanet(pointA, pointB);

            if (currentArmor < 0) {
                    return  -1;
            }
            if (currentArmor > 100) {
                    return -1;
            }
            if (distanceToTravel < 0) {
                    return -1;
            }
            if (currentIridium < 0) {
                    return -1;
            }
            if (currentIridium > 100) {
                    return -1;
            }
            if (currentPalladium < 0) {
                    return -1;
            }
            if (currentPalladium > 100) {
                    return -1;
            }
            if (currentPlatinum < 0) {
                    return -1;
            }
            if (currentPlatinum > 100) {
                    return -1;
            }
            if (totalResources > 300) {
                    return -1;
            }

            double weightOfShip = currentArmor * currentArmor + totalResources +1;
            double fuelForTrip = weightOfShip * (distanceToTravel / 100);
            return fuelForTrip;
        


     }
}
