/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package byui.cit260.Andromeda260.control;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.model.Game;
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

    public static void createNewGame(Player player) {
        Game game = new Game();
        game.setPlayer(player);
        Andromeda260.setGame(game);
    }
    
}
