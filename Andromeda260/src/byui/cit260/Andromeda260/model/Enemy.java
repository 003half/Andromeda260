/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author reyob
 */
public enum Enemy implements Serializable{
    
    Andorian("Violent blue-skinned savages"),
    Arcadian("Monk-like creatures"),
    Borg("The ultimate villians"),
    Xindi("The Council hates humans"),
    Organian("Incorporeal energy creatures"),
    Kree("Military-minded blue conquerors"),
    Gilliands("The Java Masters"),
    Ionian("Nature-centered creatures"),
    Noxus("A bloodthirsty people");
    
    private final String description;
    private final double weaponStrength;

     Enemy(String description) {
        this.description = description;
        weaponStrength = 1;
    }

    public String getDescription() {
        return description;
    }

    public double getWeaponStrength() {
        return weaponStrength;
    }

    

    @Override
    public String toString() {
        return "Enemy{" + " description=" + description + ", weaponStrength=" + weaponStrength + '}';
    }
    
   
}
