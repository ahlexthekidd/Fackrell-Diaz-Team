/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.MapControl;
import java.awt.Point;
import java.util.Scanner;


/**
 *
 * @author Zero
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Game Menu                             |"
                + "\n-----------------------------------------"
                + "\nF - Fight"
                + "\nP - Use Power Up"
                + "\nM - Move to Location"
                + "\nH - Help Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "F": // create and start a new game
                this.fight();
                break;
            case "P": // get and start an existing game
                this.powerUp();
                break;
            case "M": // display the help menu
                this.moveLocation();
                break;
            case "H": // save the current game
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void fight() {
        System.out.println("*** fight function called ***");
    }

    private void powerUp() {
        System.out.println("*** powerUp function called ***");
    }

    private void moveLocation() {
        Actor actor = new Actor();
        Point coordinates = new Point();
        MapControl move = new MapControl();
        move.moveLocation(actor, coordinates);
        coordinates.setLocation(coordinates);
        System.out.println("Your current location: " + coordinates);
    }

    private void displayHelpMenu() { 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}

