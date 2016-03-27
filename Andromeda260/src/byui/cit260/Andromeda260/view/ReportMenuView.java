/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.view;

import byui.cit260.Andromeda260.model.Planet;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reyob
 */
public class ReportMenuView extends View{
    
    public ReportMenuView(){
        this.menu = "\n"
                + "\nP - Save report on planets"
                + "\nQ - return to game";
    }
    
    @Override
    public void doAction(char selection) {
        switch (selection) {
            case 'P':
                try {planetaryReport();}
                catch (FileNotFoundException e)
                {ErrorView.display(this.getClass().getName(), e.getMessage());}
                break;
            case 'Q':
                break;
            default:
                this.console.println("Invalid option");
                break;
        }
    }

    private void planetaryReport() throws FileNotFoundException {
        try{
            //prompt for file path
            this.console.println("Please enter the file path for the report");
            String flp = this.getFileName();
            flp += ".txt";
            String report = "Planets that have been explored or visited";
            try (PrintWriter out = new PrintWriter(flp)) {
                out.println(report);
                String nextLine = "\nRow\tColumn\tExplored\tVisited\tName/Scene";
                out.println(nextLine);
                report += nextLine;
                Planet[][] planets = andromeda260.Andromeda260.getGame().getMap().getPlanet();
                for (Planet[] row:planets){
                    for(Planet column:row){
                        nextLine = "\n" + (column.getRow() + 1) + "\t" + (column.getColumn() + 1)
                                + "\t" + column.getExplored() + "\t\t" + column.getVisited()
                                + "\t" + column.getScene();
                        out.println(nextLine);
                        report +=nextLine;
                    }
                }
            
               
            }
            this.console.println("\nYou saved the file to" + flp);
            this.console.println("\nand this is the report:");
            this.console.println(report);
        }
        catch (Exception e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
    
}

/*
    public static void saveGame(Game game, Player player, String filepath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
            output.writeObject(player); //write the player object to file
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

   private void saveCurrentGame() {
         //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where you wish"
                + " to save your progress.");
        String filePath = this.getFileName();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(Andromeda260.getGame(),Andromeda260.getPlayer() , filePath);
            this.console.println("\nSave successful");
        } catch (Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        Player player = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
            player = (Player) input.readObject(); //read the player object from file
            
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        Andromeda260.setGame(game); // save in current running file
        Andromeda260.setPlayer(player); //save in current running file
    }


*/