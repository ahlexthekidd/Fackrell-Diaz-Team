/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
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
    
}
