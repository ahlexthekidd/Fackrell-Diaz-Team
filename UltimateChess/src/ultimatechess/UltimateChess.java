/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.model.Trials;
import java.awt.Point;

/**
 *
 * @author Zero
 */
public class UltimateChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        playerOne.setLives(3);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Location Class
        Location site = new Location();
        
        site.setCoordinates(new Point(3,4));
        site.setVisited(true);
        site.setAmountRemaining(25);
        String siteInfo = site.toString();
        System.out.println(siteInfo);
        
        // Trials class
        Trials trial = new Trials();
        
        trial.setDescription("This is a fight scene");
        trial.setCoordinates(new Point(4,3));
        trial.setVisited(true);
        trial.setAmountRemaining(13);
        String trialInfo = trial.toString();
        System.out.println(trialInfo);
        
        // Map class
        Map board = new Map();
        
        board.setColumnCount(25);
        board.setRowCount(25);
        String boardInfo = board.toString();
        System.out.println(boardInfo);
        
        // Actor Class
        Actor actor = new Actor();
        
        actor.setName("Pawn");
        actor.setDescription("This is The Pawn");
        actor.setCoordinates(new Point(2,3));
        actor.setHealth(25);
        String actorInfo = actor.toString();
        System.out.println(actorInfo);
        
    }
    
}
