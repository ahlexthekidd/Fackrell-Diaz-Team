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
import byui.cit260.ultimateChess.view.StartProgramView;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Zero
 */
public class UltimateChess {

    private static Game currentGame = null;
    private static Player player = null; 

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setCurrentGame(Game currentGame) {
        UltimateChess.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        UltimateChess.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
}
}