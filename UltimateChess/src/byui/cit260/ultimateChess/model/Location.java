/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jhon Diaz
 */
public class Location implements Serializable {
    
    // class instances and variables
    private Point coordinates;
    private boolean visited;
    private int amountRemaining;

    // default constructor
    public Location() {
    }

    // getter and setters
    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.coordinates);
        hash = 67 * hash + (this.visited ? 1 : 0);
        hash = 67 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinates=" + coordinates + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }
    
    
}
