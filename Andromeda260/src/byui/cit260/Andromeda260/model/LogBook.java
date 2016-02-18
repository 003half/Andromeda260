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
public class LogBook implements Serializable{
    
    private String explored;
    private String encounter;
    private String credits;

    public LogBook() {
    }

    public String getExplored() {
        return explored;
    }

    public void setExplored(String explored) {
        this.explored = explored;
    }

    public String getEncounter() {
        return encounter;
    }

    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.explored);
        hash = 11 * hash + Objects.hashCode(this.encounter);
        hash = 11 * hash + Objects.hashCode(this.credits);
        return hash;
    }

    @Override
    public String toString() {
        return "LogBook{" + "explored=" + explored + ", encounter=" + encounter + ", credits=" + credits + '}';
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
        final LogBook other = (LogBook) obj;
        if (!Objects.equals(this.explored, other.explored)) {
            return false;
        }
        if (!Objects.equals(this.encounter, other.encounter)) {
            return false;
        }
        if (!Objects.equals(this.credits, other.credits)) {
            return false;
        }
        return true;
    }
    
    
    
}
