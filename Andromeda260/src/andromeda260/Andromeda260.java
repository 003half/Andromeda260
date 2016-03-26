/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package andromeda260;

import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Player;
import byui.cit260.Andromeda260.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ruben Gonzalez Flores & Dean Boyer
 */
public class Andromeda260 {
    
    public static Game game;
    public static Player player;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Andromeda260.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Andromeda260.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Andromeda260.logFile = logFile;
    }
    
    public static void main(String[] args) {
        
        
        try {
            
            //open charcter stream files for end user input and output
            Andromeda260.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            Andromeda260.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            Andromeda260.logFile = new PrintWriter(filePath);
            
            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
        } catch (Exception te){
            System.out.println("Exception: " + te.toString()
                    + "\nCause: " + te.getCause()
                    + "\nMessage: " + te.getMessage());
        }
        finally {
            try {
                if (Andromeda260.inFile != null)
                    Andromeda260.inFile.close();
                if (Andromeda260.outFile != null)
                    Andromeda260.outFile.close();
                if (Andromeda260.logFile != null)
                    Andromeda260.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
}
