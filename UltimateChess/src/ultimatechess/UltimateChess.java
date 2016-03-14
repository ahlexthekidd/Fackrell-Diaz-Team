/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.view.StartProgramView;

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