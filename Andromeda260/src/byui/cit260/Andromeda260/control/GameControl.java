/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package byui.cit260.Andromeda260.control;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.exceptions.GameControlException;
import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Map;
import byui.cit260.Andromeda260.model.MaterialResources;
import byui.cit260.Andromeda260.model.Player;
import byui.cit260.Andromeda260.model.Resource;
import byui.cit260.Andromeda260.model.Ship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameControl {

    public static Player createPlayer(String name) {
       if (name == null) {
           return null;
       }
       
       Player player = new Player();
       player.setName(name);
       
       andromeda260.Andromeda260.setPlayer(player); // save the player
       
       return player;
    }

    public static void createNewGame(Player player) {
        Game gameOn = new Game();
        gameOn.setPlayer(player);
        MaterialResources[] materialResources = GameControl.createMaterialResources();
        gameOn.setMaterialResources(materialResources);
        Ship ship = new Ship();
        gameOn.setShip(ship);
        Map map = MapControl.createMap();
        gameOn.setMap(map);
        player.setLocation(map.getLocation(0, 0));
        andromeda260.Andromeda260.setGame(gameOn);
    }
    
  /* This function no longer necessary
    static void assignSceneToPlanet(Map map, Scene[] scenes) {
        Planet[][] planets = map.getPlanet();
        int row = 0;
        int col = 0;
        for (; row < planets.length; row++){
            for (; col < planets[1].length; col++){
                Planet here = new Planet();
                //random location type
                here.setScene(SceneType.values()[(int) (Math.random() * 2 + 1 )]);
                here.setRow(row);
                here.setColumn(col);
            }
        }
    }
    */
    
    private static MaterialResources[] createMaterialResources() {
        MaterialResources[] materialResources = new MaterialResources[4];
        
        MaterialResources iridium = new MaterialResources();
        iridium.setDescription("Iridium");
        iridium.setQuantity(0);
        materialResources[Resource.iridium.ordinal()] = iridium;
        
        MaterialResources pallidium = new MaterialResources();
        pallidium.setDescription("Pallidium");
        pallidium.setQuantity(0);
        materialResources[Resource.palladium.ordinal()] = pallidium;
        
        MaterialResources platinum = new MaterialResources();
        platinum.setDescription("Platinum");
        platinum.setQuantity(0);
        materialResources[Resource.platinum.ordinal()] = platinum;
        
        MaterialResources coins = new MaterialResources();
        coins.setDescription("Coins");
        coins.setQuantity(0);
        materialResources[Resource.coins.ordinal()] = coins;
        
        return materialResources;
    }
    
    public static MaterialResources[] getSortedInventoryList(){
        MaterialResources[] sIL = Andromeda260.getGame().getMaterialResources();
        return sIL;
    }
    
    public static int getInventoryWeight(){
        MaterialResources[] sIL = Andromeda260.getGame().getMaterialResources();
        int iW = 0;
        for (MaterialResources sIL1 : sIL) {
            iW += sIL1.getQuantity();
        }
        iW -= sIL[Resource.coins.ordinal()].getQuantity();
        return iW;
    }

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
    
}
