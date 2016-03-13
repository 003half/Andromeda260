/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import byui.cit260.Andromeda260.model.Planet;

/**
 *
 * @author rubengonzalezflores
 */
public class Map implements Serializable {
    private int noOfRows;
    private int noOfColumns;
    private String planetName;
    private ArrayList<Game> game;
    private Planet[][] planets;
    
    public Map() {
    }
    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and columns mus be >zero");
            return;
        }
        //TODO FIX THIS :D
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        this.planets = new Planet[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                Planet planet = new Planet();
                planet.setColumn(column);
                planet.setRow(row);
                planet.setVisited(false);
                planet.setExplored(false);
                planets[row][column] = planet;
                
                
            }
        }
        
    }
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
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
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.planetName);
        return hash;
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
        if (!Objects.equals(this.planetName, other.planetName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "planetName=" + planetName + '}';
    }
    
    
}
