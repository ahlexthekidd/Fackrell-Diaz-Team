/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.TrialsControl;
import citbyui.cit260.ultimatechess.exceptions.TrialsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zero
 */
public class FightView extends View {
    
     public FightView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Fight Menu                             |"
                + "\n-----------------------------------------"
                + "\nA - Attack"
                + "\nD - Defend"
                + "\nR - Run Away"
                + "\nH - Help Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "A": {
            try {
                // initiate an attack
                this.attack();
            } catch (TrialsControlException ex) {
                Logger.getLogger(FightView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "D": // initiate defend
                this.defend();
                break;
            case "R": // initiate running away
                this.run();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }
    
    private void attack() throws TrialsControlException {
        TrialsControl fight = new TrialsControl();
        fight.fightScene(Actor.Pawn, Actor.Enemy, 0);
    }
    
    private void defend() {
         this.console.println("*** You have attempted to defend ***");
    }

    private void run() {
         this.console.println("*** You have attempted to run ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
