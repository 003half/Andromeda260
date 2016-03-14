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
 * @author rubengonzalezflores
 */
public class MaterialResources implements Serializable{
    
    private String description;
    private int quantity;
    
    Ship ship;
    Planet planet;
    
    public MaterialResources() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.quantity;
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
        final MaterialResources other = (MaterialResources) obj;
        if (this.description != other.description) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "MaterialResources{" + "iridium=" + description + ", palladium=" + quantity +'}';
    }
    
    
}
