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
    private int creditsColected;
    
    Ship ship;
    Game game;
    
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

    public int getCreditsColected() {
        return creditsColected;
    }

    public void setCreditsColected(int creditsColected) {
        this.creditsColected = creditsColected;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.explored);
        hash = 11 * hash + Objects.hashCode(this.encounter);
        hash = 11 * hash + Objects.hashCode(this.creditsColected);
        return hash;
    }

    @Override
    public String toString() {
        return "LogBook{" + "explored=" + explored + ", encounter=" + encounter + ", credits=" + creditsColected + '}';
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
        if (!Objects.equals(this.creditsColected, other.creditsColected)) {
            return false;
        }
        return true;
    }
    
    
    
}
