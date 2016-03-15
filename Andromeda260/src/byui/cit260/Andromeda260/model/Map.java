package byui.cit260.Andromeda260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author rubengonzalezflores & Dean Boyer
 */
public class Map implements Serializable {
    public int noOfRows;
    public int noOfColumns;
    
    ArrayList<Game> game;
    Planet[][] planets;
    
    //public Map() {
    //}
    
    public Map(int noOfRows, int noOfColumns) {
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and columns mus be >zero");
            return;
        }
        this.planets = new Planet[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                Planet planet = new Planet();
                planet.setColumn(column);
                planet.setScene(SceneType.values()[(int) (Math.random() * 2 + 1 )]);
                planet.setRow(row);
                planet.setVisited(false);
                planet.setExplored(false);
                planets[row][column] = planet;
            }
        }
    }
    
    public String getMapString(){
        String rtn = "";
        
        for (int row = 0; row < noOfRows; row++){
            for (int col = 0; col < noOfColumns; col++){
                if (planets[row][col].getVisited() == true){
                rtn += "X";} else rtn += "O";
                rtn += "\t";
            }
            rtn +="\n";
        }
        return rtn;
    }
    
    public Planet getLocation (int row, int col){
        return planets[row][col];
    }

    public ArrayList<Game> getGame() {
        return game;
    }

    public void setGame(ArrayList<Game> game) {
        this.game = game;
    }

    public Planet[][] getPlanet() {
        return planets;
    }

    public void setPlanet(Planet[][] planet) {
        this.planets = planet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + '}';
    }
    
    
}
