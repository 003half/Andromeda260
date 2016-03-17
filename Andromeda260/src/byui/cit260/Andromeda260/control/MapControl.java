package byui.cit260.Andromeda260.control;

import andromeda260.Andromeda260;
import static byui.cit260.Andromeda260.control.GameControl.getInventoryWeight;
import byui.cit260.Andromeda260.model.Game;
import byui.cit260.Andromeda260.model.Map;
import byui.cit260.Andromeda260.model.Scene;
import byui.cit260.Andromeda260.model.SceneType;

/*
 * Authors Dean Boyer & Rueben Gonzales
 */
public class MapControl {

    public static double distanceToPlanet(int curow, int cucolumn, int row, int column) {
        int rowSide = curow - row;
        if (rowSide < 0) {rowSide *= -1;}
        int columnSide = cucolumn - column;
        if (columnSide < 0) {columnSide *= -1;}
        double distancToTravel = calculateHypotenuse(rowSide, columnSide);
        return distancToTravel;
    }

    public static double calculateHypotenuse(int sideA, int sideB) {
       double hypotenuse = sideA * sideA + sideB * sideB;
       hypotenuse = Math.sqrt(hypotenuse);
       return hypotenuse;
    }
    
    private Map map;

    public Map getMap() {
        return map;
    }

    static Map createMap() {
        int noOfRows = 3;
        int noOfColumns = (int) (Math.random()* 10) + 3;
        Map map = new Map(noOfRows, noOfColumns);
        Scene[] scene = createScene();
        //function rendered obselete with one line of code in Map map = new Map(noOfRows, noOfColumns);
        //GameControl.assignSceneToPlanet(map, scene);
        return map;
    }
    
    private static Scene[] createScene() {
        Game game = Andromeda260.getGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Some generic Description. Start.");
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Another generic Description. End.");
        scenes[SceneType.end.ordinal()] = finishScene;
        
        Scene hostileScene = new Scene();
        hostileScene.setDescription("Another generic Description. hostileScene.");
        scenes[SceneType.hostile.ordinal()] = hostileScene;
        
        Scene friendlyScene = new Scene();
        friendlyScene.setDescription("Another generic Description.friendlyScene");
        scenes[SceneType.friendly.ordinal()] = friendlyScene;
        
        Scene repairYardScene = new Scene();
        repairYardScene.setDescription("Another generic Description.repairYardScene");
        scenes[SceneType.repairYard.ordinal()] = repairYardScene;
        
        return scenes;
    }
    
    public double olddistanceToPlanet(double pointA, double pointB){
        double distance = 0;
        if (pointA > pointB)   {
            distance = pointA - pointB;
            }
        if (pointA < pointB)    {
            distance = pointB - pointA;
            }
        return distance;
    }
     
    public double oldfuelNeeded(double pointA, double pointB, double armor, double iridium, double palladium, double platinum){
        double currentArmor = armor;
        double currentIridium = iridium;
        double currentPalladium = palladium;
        double currentPlatinum = platinum;
        double totalResources = currentIridium + currentPalladium + currentPlatinum;
        double distanceToTravel = this.olddistanceToPlanet(pointA, pointB);

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
     
    public static double fuelNeeded(double distance){
        double currentArmor = andromeda260.Andromeda260.getGame().getShip().getArmor();
        double currentWeight = getInventoryWeight();
        double distanceToTravel = distance;
        double weightOfShip = currentArmor * currentArmor + currentWeight +1;
        double fuelForTrip = weightOfShip * (distanceToTravel / 100);
        return fuelForTrip;
    }
     
    public static double cylinderVolumeCalculator(double height, double radius){
        if (height < 0 || radius < 0 || height > 100 || radius > 100) {
            return -1;
            }
        double total = 3.14 * height * radius * radius;
        return total;
    }
     
    public double upgradedArmor(double iridium, double pallidium, double platinum){
        if (iridium < 0 || iridium > 100 || pallidium < 0 || pallidium >100 || platinum < 0 || platinum > 100)
        {return -1;}
        double newArmorCalc = iridium + pallidium + platinum;
        double newArmor = (newArmorCalc / 3) /3;
        return newArmor;
    }
}
             
     
