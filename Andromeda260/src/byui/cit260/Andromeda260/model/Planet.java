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
public class Planet implements Serializable {
    
    private String name;
    
    private String description;
    
    private String system;
    private int column;
    private int row;
    private Boolean visited;
    
    private Boolean explored;

    public Planet() {
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

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean getExplored() {
        return explored;
    }

    public void setExplored(Boolean explored) {
        this.explored = explored;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.system);
        hash = 41 * hash + this.column;
        hash = 41 * hash + this.row;
        hash = 41 * hash + Objects.hashCode(this.visited);
        hash = 41 * hash + Objects.hashCode(this.explored);
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
        final Planet other = (Planet) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.system, other.system)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.explored, other.explored)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Planet{" + "name=" + name + ", description=" + description + ", system=" + system + ", column=" + column + ", row=" + row + ", visited=" + visited + ", explored=" + explored + '}';
    }



    
    
}