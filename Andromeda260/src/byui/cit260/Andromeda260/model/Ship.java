/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author reyob
 */
public class Ship implements Serializable{
    private String shipName;
    private String description;
    private double shipIntegrity;
    private double armor;
    private double weapons;
    private double fuel;

    LogBook logbook;
    ArrayList<Game> game;
    MaterialResources[] materialResources;
    Planet currentLocation;
    
    public Ship() {
        this.shipName = ("Excelsior");
        this.description = ("The great. The mighty. The Excelsior.");
        this.shipIntegrity = 1;
        this.armor = 1;
        this.weapons = 1;
        this.fuel = 10;
    }
    
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getShipIntegrity() {
        return shipIntegrity;
    }

    public void setShipIntegrity(double shipIntegrity) {
        this.shipIntegrity = shipIntegrity;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getWeapons() {
        return weapons;
    }

    public void setWeapons(double weapons) {
        this.weapons = weapons;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public LogBook getLogbook() {
        return logbook;
    }

    public void setLogbook(LogBook logbook) {
        this.logbook = logbook;
    }

    public ArrayList<Game> getGame() {
        return game;
    }

    public void setGame(ArrayList<Game> game) {
        this.game = game;
    }

    public MaterialResources[] getMaterialResources() {
        return materialResources;
    }

    public void setMaterialResources(MaterialResources[] materialResources) {
        this.materialResources = materialResources;
    }

    public Planet getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Planet currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.shipName);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.shipIntegrity) ^ (Double.doubleToLongBits(this.shipIntegrity) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.armor) ^ (Double.doubleToLongBits(this.armor) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.weapons) ^ (Double.doubleToLongBits(this.weapons) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Ship{" + "shipName=" + shipName + ", description=" + description + ", shipIntegrity=" + shipIntegrity + ", armor=" + armor + ", weapons=" + weapons +  '}';
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
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.shipIntegrity) != Double.doubleToLongBits(other.shipIntegrity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armor) != Double.doubleToLongBits(other.armor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weapons) != Double.doubleToLongBits(other.weapons)) {
            return false;
        }
        if (!Objects.equals(this.shipName, other.shipName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
