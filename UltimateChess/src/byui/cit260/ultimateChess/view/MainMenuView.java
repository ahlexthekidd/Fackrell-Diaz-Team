/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.GameControl;
import citbyui.cit260.ultimatechess.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class MainMenuView extends View{

    private String menu;

    public MainMenuView() {
      super("\n"
                + "\n-----------------------------------------"
                + "\n| Main Menu                             |"
                + "\n-----------------------------------------"
                + "\nN - New Game"
                + "\nL - Load Game"
                + "\nH - Help Menu"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": {
            try {
                // create and start a new game
                this.startNewGame();
            } catch (MapControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(UltimateChess.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
}
