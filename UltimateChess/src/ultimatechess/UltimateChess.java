/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.InventoryItem;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.model.Scene;
import byui.cit260.ultimateChess.model.Trials;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

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
        
        //Game class
        Game game = new Game();
        
        game.setScore(10.00);
        game.setTotalTime(10.00);
        String gameInfo = game.toString();
        System.out.println(gameInfo);
     
        //InventoryItem class
        InventoryItem inventoryItem = new InventoryItem();
        
        inventoryItem.setStock(5);
        inventoryItem.setInventoryType("Type of Powerup");
        String inventoryInfo = inventoryItem.toString();
        System.out.println(inventoryInfo);
        
        //Scene class
        Scene scene = new Scene();
        
        scene.setDescription("scene in game");
        scene.setBlocked(new Point(3,3));
        scene.setType("Type of Scene");
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);        
        
}
}