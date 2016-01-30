/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda260;

import byui.cit260.Andromeda.model.Enemy;
import byui.cit260.Andromeda.model.Game;
import byui.cit260.Andromeda.model.LogBook;
import byui.cit260.Andromeda.model.Map;
import byui.cit260.Andromeda.model.MaterialResources;
import byui.cit260.Andromeda.model.Planet;
import byui.cit260.Andromeda.model.Player;
import byui.cit260.Andromeda.model.Ship;
/**
 *
 * @author rubengonzalezflores
 */
public class Andromeda260 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        Ship ship1 = new Ship();
        LogBook logBookOne = new LogBook();
        Enemy deadPeople = new Enemy();
        Game theGame = new Game();
        Map theMap = new Map();
        Planet currentPlanet = new Planet();
        MaterialResources currentResources = new MaterialResources();
        
        
        
        playerOne.setName("Fred Flintstone");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        ship1.setShipName("Enterprise");
        ship1.setDescription("This ship is the greatest ever built!");
        ship1.setShipIntegrity(90);
        ship1.setArmor(99);
        ship1.setWeapons(99);
        ship1.setCredits(9999);
        String shipInfo = ship1.toString();
        System.out.println(shipInfo);
        logBookOne.setExplored("Nowhere yet!");
        logBookOne.setEncounter("Nobody!");
        logBookOne.setCredits("Nothing here!");
        String logBookInfo = logBookOne.toString();
        System.out.println(logBookInfo);
        deadPeople.setName("Idiots!");
        deadPeople.setDescription("Soon to be dead.");
        deadPeople.setWeaponStrength(25);
        deadPeople.setArmor(13);
        String endOfDays = deadPeople.toString();
        System.out.println(endOfDays);
        
        
        
    }
    
}
