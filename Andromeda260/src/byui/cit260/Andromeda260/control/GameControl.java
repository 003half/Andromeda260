/*
 * Authors Dean Boyer & Rueben Gonzales
 */
package byui.cit260.Andromeda260.control;

import andromeda260.Andromeda260;
import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Map;
import byui.cit260.Andromeda260.model.MaterialResources;
import byui.cit260.Andromeda260.model.Planet;
import byui.cit260.Andromeda260.model.Player;
import byui.cit260.Andromeda260.model.Resource;
import byui.cit260.Andromeda260.model.Scene;
import byui.cit260.Andromeda260.model.SceneType;
import byui.cit260.Andromeda260.model.Ship;

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
        MaterialResources[] materialResources = GameControl.createMaterialResources();
        game.setMaterialResources(materialResources);
        Ship ship = new Ship();
        game.setShip(ship);
        Map map = MapControl.createMap();
        game.setMap(map);
        MapControl.moveToEarth(map);
    }

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

    static void assignSceneToPlanet(Map map, Scene[] scenes) {
        Planet[][] planets = map.getPlanet();
        
        planets[0][0].setScene(scenes[SceneType.start.ordinal()]);
        planets[0][1].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[0][2].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[0][3].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[0][4].setScene(scenes[SceneType.repairYard.ordinal()]);
        planets[1][0].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[1][1].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[1][2].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[1][3].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[1][4].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[2][0].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[2][1].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[2][2].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[2][3].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[2][4].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[3][0].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[3][1].setScene(scenes[SceneType.repairYard.ordinal()]);
        planets[3][2].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[3][3].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[3][4].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[4][0].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[4][1].setScene(scenes[SceneType.hostile.ordinal()]);
        planets[4][2].setScene(scenes[SceneType.friendly.ordinal()]);
        planets[4][3].setScene(scenes[SceneType.repairYard.ordinal()]);
        planets[4][4].setScene(scenes[SceneType.end.ordinal()]);
        
    }
    
    public static MaterialResources[] getSortedInventoryList(){
        System.out.println("getSortedInventoryList Called");
        return null;
    }
}
