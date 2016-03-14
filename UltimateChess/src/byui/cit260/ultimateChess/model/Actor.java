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
 * @author Zero
 */
public enum Actor implements Serializable {
    
    Pawn ("The lowest of the kingdom's defenses"),
    Rook ("A watcher and a protector"),
    Knight("The highest of the kingdom's defenses"),
    Bishop ("A priest able to grant abilities"),
    King ("The ruler of the kingdom"),
    Queen ("Rules with the king"),
    Enemy ("It's an enemy to the kingdom");
    
    // class instances and variables
    private final String description;
    private final Point coordinates;
    private final int health;
    private final int level;
    private final int attack;
    private final int defense;

    // default constructor
    Actor (String description) {
        this.description = description;
        coordinates = new Point(1,1);
        health = 10;
        level = 1;
        attack = 3;
        defense = 3;
    }
     
    // getters and setters
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public int getHealth() {
        return health;
    }
    
    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }    
}
