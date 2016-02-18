/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.control;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.model.Player;

/**
 *
 * @author rubengonzalezflores
 */
public class GameControl {

    public static Player createPlayer(String name) {
       if (name == null) {
           return null;
       }
       
       Player player = new Player();
       player.setName(name);
       
       Andromeda260.setPlayer(player); // save the player
       
       return player;
    }
    
}
