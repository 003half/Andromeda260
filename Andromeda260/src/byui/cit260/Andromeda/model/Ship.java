/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda.model;

import java.io.Serializable;
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
    private double credits;

    public Ship() {
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

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.shipName);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.shipIntegrity) ^ (Double.doubleToLongBits(this.shipIntegrity) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.armor) ^ (Double.doubleToLongBits(this.armor) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.weapons) ^ (Double.doubleToLongBits(this.weapons) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.credits) ^ (Double.doubleToLongBits(this.credits) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Ship{" + "shipName=" + shipName + ", description=" + description + ", shipIntegrity=" + shipIntegrity + ", armor=" + armor + ", weapons=" + weapons + ", credits=" + credits + '}';
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
        if (Double.doubleToLongBits(this.credits) != Double.doubleToLongBits(other.credits)) {
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
