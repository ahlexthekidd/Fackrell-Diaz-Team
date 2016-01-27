/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Player;

/**
 *
 * @author Zero
 */
public class UltimateChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        playerOne.setLives(3);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
