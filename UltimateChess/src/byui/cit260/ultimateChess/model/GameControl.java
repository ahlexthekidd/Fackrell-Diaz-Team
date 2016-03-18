/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import citbyui.cit260.ultimatechess.exceptions.MapControlException;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class GameControl {
    
    public static void createNewGame(Player player) throws MapControlException { 
        Game game = new Game(); // create new game
        UltimateChess.setCurrentGame(game); // save UltimateChess
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Trials trials = new Trials(); // create new trials
        game.setTrials(trials); // save trials in game
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map);
        
        // move actors to starting position in map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        UltimateChess.setPlayer(player); // save the player
        
        return player;
    }

    private static InventoryItem[] createInventoryList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem health = new InventoryItem();
        health.setInventoryType("Health");
        health.setStock(0);
        inventory[Item.health.ordinal()] = health;
        
        InventoryItem armor = new InventoryItem();
        health.setInventoryType("Armor");
        health.setStock(0);
        inventory[Item.armor.ordinal()] = armor;
        
        InventoryItem levelUp = new InventoryItem();
        health.setInventoryType("PowerUp");
        health.setStock(0);
        inventory[Item.levelUp.ordinal()] = levelUp;
        
        InventoryItem incAttack = new InventoryItem();
        health.setInventoryType("PowerUp");
        health.setStock(0);
        inventory[Item.incAttack.ordinal()] = incAttack;
        
        InventoryItem incDefense = new InventoryItem();
        health.setInventoryType("PowerUp");
        health.setStock(0);
        inventory[Item.incDefense.ordinal()] = incDefense;
        
        return inventory;
    }

    public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }
    
    public enum Item {
        health,
        armor,
        levelUp,
        incAttack,
        incDefense;
    }
    
}
