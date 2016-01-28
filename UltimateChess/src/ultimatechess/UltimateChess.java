/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Player;
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
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        playerOne.setLives(3);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Location site = new Location();
        
        site.setCoordinates(new Point(3,4));
        site.setVisited(true);
        site.setAmountRemaining(25);
        String siteInfo = site.toString();
        System.out.println(siteInfo);
        
    }
    
}
