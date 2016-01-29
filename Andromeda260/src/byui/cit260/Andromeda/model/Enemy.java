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
public class Enemy implements Serializable{
    private String name;
    private String description;
    private double weaponStrength;
    private double armor;

    public Enemy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeaponStrength() {
        return weaponStrength;
    }

    public void setWeaponStrength(double weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.weaponStrength);
        hash = 59 * hash + Objects.hashCode(this.armor);
        return hash;
    }

    @Override
    public String toString() {
        return "Enemy{" + "name=" + name + ", description=" + description + ", weaponStrength=" + weaponStrength + ", armor=" + armor + '}';
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
        final Enemy other = (Enemy) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.weaponStrength, other.weaponStrength)) {
            return false;
        }
        if (!Objects.equals(this.armor, other.armor)) {
            return false;
        }
        return true;
    }
    
    
    
}
