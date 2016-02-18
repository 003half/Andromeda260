/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda260;

import byui.cit260.Andromeda260.model.Enemy;
import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.LogBook;
import byui.cit260.Andromeda260.model.Map;
import byui.cit260.Andromeda260.model.MaterialResources;
import byui.cit260.Andromeda260.model.Planet;
import byui.cit260.Andromeda260.model.Player;
import byui.cit260.Andromeda260.model.Ship;
import citbyui.cit260.Andromeda260.view.StartProgramView;
/**
 *
 * @author rubengonzalezflores
 */
public class Andromeda260 {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void setCurrentGame(Game currentGame) {
        Andromeda260.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        Andromeda260.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
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
