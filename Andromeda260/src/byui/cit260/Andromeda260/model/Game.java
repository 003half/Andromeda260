/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Andromeda260.model;

import java.io.Serializable;

/**
 *
 * @author rubengonzalezflores
 */
public class Game implements Serializable {
    
    Player player;
    Ship ship;
    Map map;
    MaterialResources[] materialResources;
    LogBook captainsLog;
    
    public Game(){
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public void setPlayer(Player player){
        this.player = player;
    }
    
    private long totalTime;

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public MaterialResources[] getMaterialResources() {
        return materialResources;
    }

    public void setMaterialResources(MaterialResources[] materialResources) {
        this.materialResources = materialResources;
    }

    public LogBook getCaptainsLog() {
        return captainsLog;
    }

    public void setCaptainsLog(LogBook captainsLog) {
        this.captainsLog = captainsLog;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

}
