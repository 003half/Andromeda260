/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda.model;

import java.io.Serializable;

/**
 *
 * @author rubengonzalezflores
 */
public class MaterialResources implements Serializable{
    
    private int iridium;
    
    private int palladium;
    
    private int platinium;

    public MaterialResources() {
    }

    public int getIridium() {
        return iridium;
    }

    public void setIridium(int iridium) {
        this.iridium = iridium;
    }

    public int getPalladium() {
        return palladium;
    }

    public void setPalladium(int palladium) {
        this.palladium = palladium;
    }

    public int getPlatinium() {
        return platinium;
    }

    public void setPlatinium(int platinium) {
        this.platinium = platinium;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.iridium;
        hash = 89 * hash + this.palladium;
        hash = 89 * hash + this.platinium;
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
        if (this.iridium != other.iridium) {
            return false;
        }
        if (this.palladium != other.palladium) {
            return false;
        }
        if (this.platinium != other.platinium) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MaterialResources{" + "iridium=" + iridium + ", palladium=" + palladium + ", platinium=" + platinium + '}';
    }
    
    
}
