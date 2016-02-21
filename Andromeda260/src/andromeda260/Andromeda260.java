/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package andromeda260;

import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Player;
import citbyui.cit260.Andromeda260.view.StartProgramView;
/**
 *
 * @author rubengonzalezflores
 */
public class Andromeda260 {
    
    private static Game game;
    private static Player player;

    public static void setGame(Game game) {
        Andromeda260.game = game;
    }

    public static void setPlayer(Player player) {
        Andromeda260.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static Player getPlayer() {
        return player;
    }
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        
        startProgramView.startProgram();
        
        
    }
    
}
